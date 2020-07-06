package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DetailsService;

@RestController
public class MainController {
	
	@Autowired
	private DetailsService detailsService;
	
	@RequestMapping("/details")
	public List<Details> getAllDetails(){
			return detailsService.getAllDetails();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/details")
	public String addDetail(@RequestBody Details detail) {
		detailsService.addDetail(detail);
		return "Succesful";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/details/{clinic_name}")
	public Optional<Details> addDetail(@PathVariable String clinic_name) {
		return detailsService.getDetail(clinic_name);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/details/{clinic_name}")
	public String deleteDetail(@PathVariable String clinic_name) {
		detailsService.deleteDetail(clinic_name);
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