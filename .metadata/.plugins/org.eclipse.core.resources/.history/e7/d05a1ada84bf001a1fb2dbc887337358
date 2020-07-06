package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.controller.Details;

public interface MessageRepository extends CrudRepository<Details, String> {

	//filter foreign table and its referenced column name
	public List<Details> findByDetailsClinc_name(String address);
	
}
