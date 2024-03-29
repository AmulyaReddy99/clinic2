package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.controller.Details;

public interface DetailsRepository extends CrudRepository<Details, String> {

	// custom filters
	public List<Details> findByClinicname(String clinicname);
	public List<Details> findByType(String type);
	public List<Details> findByStatus(String status);
	public List<Details> findByAddress(String address);

}

