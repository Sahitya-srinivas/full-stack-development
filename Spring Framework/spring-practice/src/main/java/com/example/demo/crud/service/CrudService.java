package com.example.demo.crud.service;

import org.springframework.stereotype.Service;

@Service
public class CrudService {
	
	public String greetUser(String name) {
		return "Hi, "+name;
	}
	
	public String getID(int id) {
		return "Your ID is: "+id;
	}

}
