package models;

import javax.persistence.*;
import java.util.*;

@Entity
public class Player {

	@Id
	@GeneratedValue
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	private String username;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	private String password;

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	private String fullname;

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getFullname() {
		return fullname;
	}

	private Boolean online;

	public void setOnline(Boolean online) {
		this.online = online;
	}

	public Boolean getOnline() {
		return online;
	}

	@OneToOne()
	private Resources resources;

	public void setResources(Resources resources) {
		this.resources = resources;
	}

	public Resources getResources() {
		return resources;
	}

	@OneToMany()
	private List<Message> messages = new LinkedList<Message>();

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<Message> getMessages() {
		return messages;
	}

}
