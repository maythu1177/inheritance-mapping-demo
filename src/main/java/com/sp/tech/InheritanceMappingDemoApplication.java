package com.sp.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sp.tech.service.VetService;

@SpringBootApplication
public class InheritanceMappingDemoApplication implements CommandLineRunner {
	
	@Autowired
	private VetService vetService;

	public static void main(String[] args) {
		SpringApplication.run(InheritanceMappingDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		vetService.saveVet();
		
	}

}
