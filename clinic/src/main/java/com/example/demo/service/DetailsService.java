package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.Details;
import com.example.demo.repository.DetailsRepository;

@Service
public class DetailsService {
	
	@Autowired
	DetailsRepository detailsRepository;
	
	List<Details> details = Arrays.asList(
				new Details(1L,"c1","general","open","9999","abc building, abc colony"),
				new Details(2L,"c2","children","open","9998","abc building, abc colony"),
				new Details(3L,"c3","general","open","9997","abc building, abc colony"),
				new Details(4L,"c4","general","closed","9996","abc building, abc colony")
			);
	
	public List<Details> getAllDetails(){
		
		List<Details> details = new ArrayList<>();
		detailsRepository.findAll()
		.forEach(details::add);
		return details;
		
	}
	
	public void addDetail(Details detail) {
		detailsRepository.save(detail);
	} 
	
	public Optional<Details> getDetail(String clinicname) throws IllegalArgumentException {
		 return detailsRepository.findById(clinicname);
	}
		
	public void deleteDetail(String clinicname) {
		detailsRepository.deleteById(clinicname);
	}
	
}
