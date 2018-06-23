package com.robustroot.petrolbunkmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.robustroot.petrolbunkmanagement.entity.Bunk;
import com.robustroot.petrolbunkmanagement.service.BunkService;

@RestController
public class BunkController {
	@Autowired
	BunkService bunkService ;
	
	@RequestMapping(method=RequestMethod.POST , value="/insertbunk")
	public String  insertBunk(@RequestBody Bunk bunk){
		return bunkService.insertBunk(bunk);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/updatebunk")
	public String  updateBunk(@RequestBody Bunk bunk){
		return bunkService.updateBunk(bunk);
	}

}
