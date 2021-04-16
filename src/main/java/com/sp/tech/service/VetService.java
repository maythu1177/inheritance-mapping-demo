package com.sp.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sp.tech.model.ExHouseVet;
import com.sp.tech.model.InHouseVet;
import com.sp.tech.repo.ExHouseRepo;
import com.sp.tech.repo.InHouseRepo;

@Service
public class VetService {
	
	@Autowired
	private InHouseRepo inHouseRepo;
	
	@Autowired
	private ExHouseRepo exHouseRepo;
	
	@Transactional
	public void saveVet() {
		InHouseVet in1 = new InHouseVet("thaw thaw","bcsc",2000000);
		InHouseVet in2 = new InHouseVet("mae maw","master",2000000);
		
		ExHouseVet ex1 = new ExHouseVet("john","it","japan",40000);
		ExHouseVet ex2 = new ExHouseVet("thomas","it","sg",400000);
		
		inHouseRepo.save(in1);
		inHouseRepo.save(in2);
		
		exHouseRepo.save(ex1);
		exHouseRepo.save(ex2);
		
	}

}
