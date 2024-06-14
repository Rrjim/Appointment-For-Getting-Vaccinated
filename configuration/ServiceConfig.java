package com.example.vaccinationapp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.vaccinationapp.apiservices.*;
import com.example.vaccinationapp.entities.*;

@Configuration
public class ServiceConfig implements CommandLineRunner{
	@Autowired
	ApplicationService appService;

	@Override
	public void run(String... args) throws Exception {

	}
	
}
