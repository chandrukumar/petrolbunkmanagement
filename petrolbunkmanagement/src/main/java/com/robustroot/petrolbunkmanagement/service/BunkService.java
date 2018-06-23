package com.robustroot.petrolbunkmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robustroot.petrolbunkmanagement.entity.Bunk;
import com.robustroot.petrolbunkmanagement.repository.BunkRepository;

@Service
public class BunkService {
	@Autowired
	BunkRepository bunkRepository;
	
	public String insertBunk(Bunk bunk){
		bunkRepository.save(bunk);
		return "success";
	}

}
