package com.example.demo.controller;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Messages {
		
	@Id
	private String message_id;
	private String clinic_name;
	private String person_name;
	private String timestamp;
	@ManyToOne
	private Details detail;
	
	public Messages() {
		
	}
	
	public Messages(String message_id, String clinic_name, String person_name, String timestamp, Details detail) {
		super();
		this.message_id = message_id;
		this.clinic_name = clinic_name;
		this.person_name = person_name;
		this.timestamp = timestamp;
		this.detail = new Details(clinic_name, "", "", "", "");
	}
	
	public String getMessage_id() {
		return message_id;
	}
	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}
	public String getClinic_name() {
		return clinic_name;
	}
	public void setClinic_name(String clinic_name) {
		this.clinic_name = clinic_name;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
}
