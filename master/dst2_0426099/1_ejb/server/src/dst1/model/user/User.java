package dst1.model.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import dst1.model.Membership;
import dst1.model.tasks.Job;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames={"accountNo", "bankCode"})})
public class User extends Person{

	private static final long serialVersionUID = 5347330192460764018L;
	
	@Column(unique=true)
	private String username;
	private String password;
	private String accountNo;
	private String bankCode;
	
	@OneToMany(cascade={CascadeType.MERGE}, orphanRemoval=true)
	@JoinColumn(name="person_id")
	private Set<Job> jobs;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="membership_user_id")
	private Set<Membership> memberships; 
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public void setJobs(Set<Job> jobs) {
		this.jobs = jobs;
	}
	public Set<Job> getJobs() {
		if(jobs == null)
			jobs = new HashSet<Job>();
		return jobs;
	}
	public void setMemberships(Set<Membership> memberships) {
		this.memberships = memberships;
	}
	public Set<Membership> getMemberships() {
		if(memberships == null)
			memberships = new HashSet<Membership>();
		return memberships;
	}
	
	@Override
	public String toString() {
		return super.toString()+", usr:"+username+" psw:"+password+", AccNo: "+accountNo+" bc: "+bankCode+", {jobs:"+getJobs().size()+"}";
	}
	
}
