package aufgabe3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class RecordsManagement implements Serializable{
	
	private static final long serialVersionUID = -3129410752019265150L;
	private HashMap<String,Station> stations = new HashMap<String,Station>();
	private HashMap<String,HashMap<Date,RecordFolder>> stationfolders = new HashMap<String,HashMap<Date,RecordFolder>>();
	private HashMap<String,Parameter> parameters = new HashMap<String,Parameter>();
	private HashMap<Date,Log> log = new HashMap<Date,Log>();
	private Units units_management;
	transient private BackupThread backT = null;
	private Authorisation login;
	private ClassManager cm;
	
	/**
	 * CONSTRUCTOR
	 * @param units_management : declares the unit management
	 */
	public RecordsManagement(Units units_management, Authorisation login) {
		this.units_management = units_management;
		this.login = login;
		cm = new ClassManager();
		
		//log
		this.addLogEntry(new Date(), "Initializing System", "");
	}
	
	/**
	 * doLogin
	 * 
	 * Expects username and password and returns a validation-hash if the transfered credentials are valid
	 * @param user
	 * @param password
	 * @return validation-hash
	 */
	public synchronized String doLogin(String user, String pwd){
		//log
		this.addLogEntry(new Date(), "Login user: "+user, "");
		return login.doLogin(user, pwd);
		
	}
	
	/**
	 * checkLogin
	 * 
	 * checks if the handed over authorisation is valid
	 * @param ticket - hash of the admin
	 * @return if the hash is valid
	 */
	public synchronized boolean checkLogin(String ticket){
		return login.checkLogin(ticket);
	}
	
	/**
	 * doLogout
	 * 
	 * loggs an user out
	 * @param ticket - validation-hash
	 * @return if the check out was successful
	 */
	public synchronized boolean doLogout(String ticket){
		//log
		this.addLogEntry(new Date(), "User has been logged out ("+ticket+")", "");
		return login.doLogout(ticket);
	}
	
	/**
	 * getUnitManagement
	 * 
	 * 
	 * @return the management of the units
	 */
	public synchronized Units getUnitManagement(){
		return units_management;
	}
	
	/**
	 * startProgram
	 * 
	 * creates and starts the backupthread and makes an instance of the ClassManager
	 */
	public void startProgram(){
		if (backT == null){
			backT = new BackupThread("RecordsManagement", this);
		}
		backT.start();
		//log
		this.addLogEntry(new Date(), "Starting program. Initializing backupfiles...", "");
	}
	
	/**
	 * stopProgram
	 * 
	 * stops and interrupts(otherwhise the backupthread would run additional 5 Minutes till the prozess terminates) the backupthread
	 * and starts the final backup of the data
	 */
	public synchronized void stopProgram(){
		backT.stop();
		backT.interrupt();
		cm.addObjectToFile("RecordsManagement", this);
		//log
		this.addLogEntry(new Date(), "Quiting program. Resolving backup-data.", "");
	}
	

	
	/*******************************************
	 * 		STATION MANAGEMENT SECTION
	 *******************************************/
	
	
	/**
	 * Adds a new Station to the HashMap.
	 * Station name must be unique or otherwise existing station will be overwritten.
	 * @param name
	 * @param password
	 * @param id
	 * @return
	 */
	public synchronized boolean addStation(String name, String password, int id, String ticket) {		
		Station stat = new Station(name,password,id);
		stations.put(name,stat);
		//log
		this.addLogEntry(new Date(), "Station added: "+name, "");
		return true;
	}
	
	/**
	 * Returns a Station by name
	 * Stationname must be valid.
	 * @param name
	 * @return
	 */
	public synchronized Station getStation(String name) {		
		return stations.get(name);
	}
	
	/**
	 * Deletes a Station.
	 * Stationname must be valid.
	 * @param name
	 * @return
	 */
	public synchronized boolean deleteStation(String name, String ticket) {
		stations.remove(name);
		//log
		this.addLogEntry(new Date(), "Station deleted: "+name, "");
		return true;
	}
	
	/**
	 * Returns station
	 * Stationname must be valid.
	 * 
	 * @return
	 */
	public synchronized String StationToString(String station_name) {
		
		String output;
		output = "================ " + station_name + " ================\n";			
		output += "Total Record Folders: " + stationfolders.get(station_name).size() + "\n";
		
		return output;
	}
	

	
	/*******************************************
	 * 		RECORDSFOLDER MANAGEMENT SECTION
	 *******************************************/
	
	/**
	 * Adds a new RecordFolder to the HashMap
	 * The key is generated by station name and the folders date hence the combination of
	 * those have to be unique.
	 * @param timestamp
	 * @param station
	 * @return
	 */
	public synchronized String addRecordFolder(Date timestamp, Station station) {		
		int id = station.getId();
		String station_name = station.getName();
		HashMap<Date,RecordFolder> station_map = stationfolders.get(station_name);
		RecordFolder recordfolder = new RecordFolder(id,timestamp,station); 
		
		//log
		this.addLogEntry(new Date(), "Adding Recordfolder: "+timestamp.toString()+" "+station.getName(), "");
		
		if(station_map != null) {
			if(station_map.containsKey(timestamp)) {
				//log
				this.addLogEntry(new Date(), "Error while adding Recordfolder.", "");
				return "Fehler: RecordFolder fuer diesen Zeitpunkt schon vorhanden!";
			} else {
				stationfolders.get(station_name).put(timestamp, recordfolder);
				return "Erfolgreich hinzugefuegt!";
			}
		} else {
			HashMap<Date,RecordFolder> newFolder = new HashMap<Date,RecordFolder>();
			stationfolders.put(station_name,newFolder);
			stationfolders.get(station_name).put(timestamp, recordfolder);
			return "Erfolgreich hinzugefuegt!";
		}
		
		
	}
	
	/**
	 * Returns the RecordFolder by Date and Station name
	 * The Date-Station combination must match a recordfolder.
	 * 
	 * @param timestamp
	 * @param station_name
	 * @return
	 */
	public synchronized RecordFolder getRecordFolder(Date timestamp, String station_name) {		
		
		//log
		this.addLogEntry(new Date(), "Fetching a record: "+timestamp.toString()+" "+station_name, "");
		
		return stationfolders.get(station_name).get(timestamp);
	}
	
	/**
	 * Adds a new Record to the specific Folder
	 * There is only one parameter per RecordFolder.
	 * 
	 * @param timestamp
	 * @param station_name
	 * @param value
	 * @param param
	 * @param device
	 * @return
	 */
	public synchronized String addNewRecordToFolder(Date timestamp, String station_name, 
			float value, String param, String device) {
		
		RecordFolder folder = getRecordFolder(timestamp,station_name);
		Parameter parameter = getParameterByName(param);	
		float base_value = units_management.getBaseUnitValue(device, value);
		Record record = new Record(base_value, parameter);
		
		//log
		this.addLogEntry(new Date(), "Adding new Record to Folder: "+param+" "+value+" "+device+" - "+station_name, "");
		
		if(checkIfUnderMinValue(param, base_value)) {
			
			//log
			this.addLogEntry(new Date(), "Record under min value ("+param+" "+value+" "+device+")", "");
			
			return "Fehler: Wert liegt unter dem Messrahmen!";
		} else if(checkIfOverMaxValue(param, base_value)) {
			
			//log
			this.addLogEntry(new Date(), "Record over max value ("+param+" "+value+" "+device+")", "");
			
			return "Fehler: Wert liegt ueber dem Messrahmen!";
		} else if(checkIfOverThreshold(param, base_value)) {
			
			//log
			this.addLogEntry(new Date(), "Record over threshold ("+param+" "+value+" "+device+")", "");
			
			folder.addRecord(record);
			return "Warnung: Wert liegt ueber dem Grenzwert!";
		} else {
			folder.addRecord(record);
			return "Wert wurde hinzugefuegt!";	
		}			
	}
	
	/**
	 * Station name, parameter name and date must be valid and must match (an) existing Record(s).
	 * Returns the avg of the given parameter in that timspan.
	 * @param station_name
	 * @param parameter_name
	 * @param from
	 * @param to
	 * @return
	 */
	public synchronized String showAverage(String station_name, String parameter_name, Date from, Date to) {
		if(from.after(to))
			return "Fehler: Startzeit liegt nach der Endzeit!\n";
		
		Iterator<Date> folder = getSortedFolders(station_name);
		String unit_sym = getBaseUnitSymbolByParamter(parameter_name);
		String output;
		int i = 0;
		float value = 0;
		float average = 0;
		
		while(folder.hasNext()) {
			Date folder_key = folder.next();
			if(folder_key.after(from) && folder_key.before(to)) {
				HashMap<String,Record> records = stationfolders.get(station_name).get(folder_key).getRecords();
				value += records.get(parameter_name).getValue();
				i++;
			}
		}
		average = value/i;
		output = "Average: " + parameter_name + ": " + average + unit_sym + "\n";
		
		//log
		this.addLogEntry(new Date(), "Calculating average.", "");
		
		return output;
	}
	
	/**
	 * Returns a list of Record Folders between two Dates from one or all stations
	 * If @param station_name equals "Alle" the method returns all 
	 * stations with their record folders between two Dates
	 * @param station_name
	 * @param from
	 * @param to
	 * @return
	 */
	public synchronized String showRecordFoldersBetweenDates(String station_name, Date from, Date to) {
		String output = "";
		if(from.after(to))
			return "Fehler: Startzeit liegt nach der Endzeit!\n";
		
		if(station_name.equals("Alle")) {
			
			/*
			 * Load all Stations ordered by station name
			 */
			List<String> sortedList = new ArrayList<String>();
			sortedList.addAll(stationfolders.keySet());
			Collections.sort(sortedList);		
			Iterator<String> iter = sortedList.iterator();
			
			while (iter.hasNext()) {
				String key = iter.next();
				output += StationToString(key);
				int i = 0;
				/* 
				 * Load record folders from station
				 */
				Iterator<Date> folder = getSortedFolders(key);			
				while(folder.hasNext()) {
					Date folder_key = folder.next();
					if(folder_key.after(from) && folder_key.before(to)) {
						output += stationfolders.get(key).get(folder_key).toString();
						i++;
					}
				}
				output += "Query findings: " + i + "\n";
			}
		} else {
			/* 
			 * Load record folders from one station
			 */		
			Iterator<Date> folder = getSortedFolders(station_name);
			int i = 0;
			while(folder.hasNext()) {
				Date folder_key = folder.next();
				if(folder_key.after(from) && folder_key.before(to)) {
					output += stationfolders.get(station_name).get(folder_key).toString();
					i++;
				}
			}
			output += "Query findings: " + i + "\n";
		}	
		
		//log
		this.addLogEntry(new Date(), "Fetching records...", "");
		
		return output;
	}
	
	/**
	 * Returns an iterator of sorted Folders
	 * @param station_name
	 * @return
	 */
	public synchronized Iterator<Date> getSortedFolders(String station_name) {
		List<Date> sortedFolders = new ArrayList<Date>();
		HashMap<Date,RecordFolder> recordfolders = stationfolders.get(station_name);
		sortedFolders.addAll(recordfolders.keySet());
		Collections.sort(sortedFolders);		
		Iterator<Date> folders = sortedFolders.iterator();
		return folders;
	}

	
	/*******************************************
	 * 		PARAMETER MANAGEMENT SECTION
	 *******************************************/
	
	/**
	 * Adds a Parameter to the HashMap.
	 * Parameter name must be unique or otherwise a existing parameter will be overwritten.
	 * 
	 * @param name
	 * @param max_value
	 * @param min_value
	 * @param threshold
	 * @param sym
	 * @return
	 */
	public synchronized boolean addParameter(String name, float max_value, float min_value,
			float threshold, String sym, String ticket) {
		Parameter par = new Parameter(name,max_value,min_value,threshold,sym);
		
		parameters.put(name,par);
		
		//log
		this.addLogEntry(new Date(), "Adding parameter: "+name, "");
		
		return true;
	}
	
	/**
	 * Deletes the parameter by the given name.
	 * Name must be a valid parameter name.
	 * 
	 * @param name
	 * @return
	 */
	public synchronized boolean deleteParameter(String name, String ticket) {
		if(parameters.remove(name) != null) {
			
			//log
			this.addLogEntry(new Date(), "Deleting parameter: "+name, "");
			
			return true;
		}
			return false;
	}
	
	/**
	 * Returns the Parameter instance by the given name
	 * Name must be a valid parameter name.
	 * 
	 * @param name
	 * @return
	 */
	public synchronized Parameter getParameterByName(String name) {
		return parameters.get(name);
	}
	
	/**
	 * Returns the (string) BaseUnit Symbol which is assigned to the Parameter.
	 * Name must be a valid parameter name.
	 *  
	 * @param name
	 * @return
	 */
	public synchronized String getBaseUnitSymbolByParamter(String name) {
		Parameter temp_par = parameters.get(name);	
		return temp_par.getUnitSymbol();
	}
	
	/**
	 * Returns all parameters as an ArrayList.
	 * 
	 * @return
	 */
	public synchronized ArrayList<String> fetchParameters() {
		ArrayList<String> temp = new ArrayList<String>(parameters.keySet());
		
		//log
		this.addLogEntry(new Date(), "Fetching paramters...", "");
		
		return temp;
	}
	
	/**
	 * Returns true if the value is under the (given) parameter's min value.
	 * 
	 * @param parameter
	 * @param value
	 * @return
	 */
	private synchronized boolean checkIfUnderMinValue(String parameter,float value) {
		Parameter temp_par = this.getParameterByName(parameter);
		
		if(temp_par != null)
			if(value < temp_par.getMin_value())
				return true;

		return false;
	}
	
	/**
	 * Checks if value is over defined max value
	 * 
	 * @param parameter
	 * @param value
	 * @return
	 */
	private synchronized boolean checkIfOverMaxValue(String parameter,float value) {
		Parameter temp_par = this.getParameterByName(parameter);
		
		if(temp_par != null)
			if(value > temp_par.getMax_value())
				return true;
		
		return false;
	}
	
	/**
	 * Returns true if value is over defined threshold
	 * 
	 * @param paramter
	 * @param value
	 * @return
	 */
	private synchronized boolean checkIfOverThreshold(String parameter, float value) {
		Parameter temp_par = this.getParameterByName(parameter);
		
		if(temp_par != null)
			if(value > temp_par.getThreshold())
				return true;
		
		return false;
	}
	
	
	/*******************************************
	 * 		LOG MANAGEMENT SECTION
	 *******************************************/
	
	/**
	 * Adds a log entry to the log hashmap.
	 * Expects valid and unique timestamp.
	 * 
	 * @param timestamp
	 * @param description
	 * @param flag
	 * @return
	 */
	public boolean addLogEntry(Date timestamp, String description, String flag) {
		
		//security check to avoid collision of adding 2 log entries in short time
		if(!log.isEmpty()) {
			while(this.checkIfDateAlreadyExists(timestamp)) {
				timestamp = new Date(timestamp.getTime()+1);
			}
		}
		
		int id = getHighestLogId()+1;
		Log logentry = new Log(timestamp,id,description,flag);
		log.put(timestamp, logentry);
		
		/*
		if(output_log == true) {
			System.out.print(logentry.getId()+": ");
			System.out.print(logentry.getTimestamp().toString()+" - ");
			System.out.println(logentry.getDescription());
		}
		*/
		
		return true;
	}
	
	/**
	 * Removes the log entry from the hashmap
	 * A logenty with the given timestamp must exist.
	 * 
	 * @param timestamp
	 * @return
	 */
	public boolean deleteLogEntry(Date timestamp) {
		log.remove(timestamp);
		return true;
	}
	
	/**
	 * Returns a log entry
	 * A logenty with the given timestamp must exist. 
	 * @param timestamp
	 * @return
	 */
	public Log getLogEntry(Date timestamp) {
		return log.get(timestamp);
	}
	
	public Log getLogById(int id) {
		ArrayList<Log> temp = new ArrayList<Log>(log.values());
		
		for(int i=0;i<temp.size();i++) {
			if(temp.get(i).getId() == id)
				return temp.get(i);
		}
		
		return new Log();
	}
	/**
	 * Returns the the id from the log file with the latest date.
	 * @return
	 */
	private int getHighestLogId() {
		if(!log.isEmpty()) {
			ArrayList<Date> tempdatekey = new ArrayList<Date>(log.keySet());
			Date tempdate = new Date(0);
			
				for(int i=0;i<tempdatekey.size();i++) {
					if(tempdatekey.get(i).after(tempdate))
						tempdate = tempdatekey.get(i);
				}
				
				Log templog = log.get(tempdate);
				
				return templog.getId();
		}
		else{
			return 0;
		}
	}
	
	/**
	 * Gets the latest log entry. If there are no log entries, then an empty log object will be returned.
	 * @return
	 */
	public Log getLatestLogEntry() {
		int last_id = this.getHighestLogId();
		
		ArrayList<Log> temp = new ArrayList<Log>(log.values());
		for(int i=0;i<temp.size();i++)
			if(last_id == temp.get(i).getId())
				return temp.get(i);
		
		return new Log();
	}
	
	/**
	 *  Returns true if there is a Log entry with the given date.
	 * @param timestamp
	 * @return
	 */
	private boolean checkIfDateAlreadyExists(Date timestamp) {
		
		if(log!= null)
			if(log.containsKey(timestamp))
				return true;
		
		return false;
 	}
	
	/**
	 * Fetch Method
	 * Will return sorted ArrayList with Log objects
	 * @return
	 */
	public ArrayList<Log> fetchLog() {
		
		ArrayList<Log> temp = new ArrayList<Log>(log.values());
		ArrayList<Integer> idlist = new ArrayList<Integer>(temp.size());
		
		for(int i=0;i<temp.size();i++) {
			idlist.add(i,temp.get(i).getId());
		}
		
		Collections.sort(idlist);
		temp.clear();
		
		for(int i=0;i<idlist.size();i++) {
			temp.add(this.getLogById(idlist.get(i)));
		}
		
		return temp;
	}
	
	/**
	 * Needs a filter that suits to at least one log flag.
	 * Will fetch all log entries with that flag.
	 * @param filter
	 * @return
	 */
	public ArrayList<Log> FilterFetchLog(String filter) {
		ArrayList<Log> temp = new ArrayList<Log>(log.values());
		
		for(int i=0;i<temp.size();i++) {
			if(!temp.get(i).getFlag().equals(filter))
				temp.remove(i);
		}
		
		return temp;
	}
}
