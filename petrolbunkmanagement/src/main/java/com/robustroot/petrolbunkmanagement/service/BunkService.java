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
		if(bunkRepository.existsById(bunk.getBunkId())){
			return "already exist";	
		}else{
		bunkRepository.save(bunk);
		}
		return "success";
	}
	public String updateBunk(Bunk bunk){
		if(bunkRepository.existsById(bunk.getBunkId())){
			bunkRepository.save(bunk);
		}else{
			return "not exist";	
		}
		return "success";
	}

}
