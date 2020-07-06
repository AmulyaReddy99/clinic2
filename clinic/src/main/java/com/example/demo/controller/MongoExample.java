package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.repository.MongoExampleRepository;

@Document
public class MongoExample {
	
	@Id
	String col1;
	String col2;
	
	public MongoExample() {
		
	}
	
	public MongoExample(String col1, String col2) {
		super();
		this.col1 = col1;
		this.col2 = col2;
	}
	
	public String getCol1() {
		return col1;
	}
	public void setCol1(String col1) {
		this.col1 = col1;
	}
	public String getCol2() {
		return col2;
	}
	public void setCol2(String col2) {
		this.col2 = col2;
	}
	
}
