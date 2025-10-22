package com.example.demo.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.crud.service.CrudService;

@RestController
public class CrudController {
	@Autowired
	CrudService crudService;
	
	@GetMapping("/getName")
	public String getName(@RequestParam String name) {
		return crudService.greetUser(name);
	}
	
	@GetMapping("/getID")
	public String getID(@RequestParam int id) {
		return crudService.getID(id);
	}

}
