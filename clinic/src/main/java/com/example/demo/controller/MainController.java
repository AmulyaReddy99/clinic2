package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.MongoExampleRepository;
import com.example.demo.service.DetailsService;

@RestController
public class MainController {
	
	@Autowired
	private DetailsService detailsService;
	
	@Autowired
	private MongoExampleRepository mongoRepo;
	
	@RequestMapping("/insert")
	public String insert() {
		mongoRepo.save(new MongoExample("success","insert"));
		return "Successful";
	}
	
	@RequestMapping("/fetch")
	public List<MongoExample> fetch() {
		return mongoRepo.findAll();
	}
	
	
	@RequestMapping("/details")
	public List<Details> getAllDetails(){
			return detailsService.getAllDetails();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/details")
	public String addDetail(@RequestBody Details detail) {
		detailsService.addDetail(detail);
		return "Succesful";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/details/{clinicName}")
	public Optional<Details> addDetail(@PathVariable String clinicName) {
		return detailsService.getDetail(clinicName);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/details/{clinicName}")
	public String deleteDetail(@PathVariable String clinicname) {
		detailsService.deleteDetail(clinicname);
		return "Succesful";
	}
	
	@RequestMapping("/stats")
	public String stats() {
		return "Stats";
	}
	
	@RequestMapping("/msgs/{name}")
	public String msgs(@PathVariable String name) {
		return "Msg from "+name;
	}
	
}
