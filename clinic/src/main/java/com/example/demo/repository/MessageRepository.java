package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.controller.Messages;

public interface MessageRepository extends CrudRepository<Messages, String> {

	//filter foreign table (which is defined as column name 'detail') and its referenced column name
	public List<Messages> findByDetailClinicname(String address);
	
}
