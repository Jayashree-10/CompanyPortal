package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.response.employeeResponse;
import com.example.demo.service.employeeService;

@RestController
@RequestMapping("/employee")
public class employeeController {

	@Autowired
	private employeeService EmployeeService;

	@GetMapping(value ="/id/{id}", produces = {MediaType.APPLICATION_JSON_VALUE })
	ResponseEntity<employeeResponse> findById(@PathVariable("id") int id) {
		employeeResponse EmployeeResponse =null;
		EmployeeResponse=EmployeeService.findByEmpId(id);
		return ResponseEntity.status(HttpStatus.OK).body(EmployeeResponse);
	}

}
