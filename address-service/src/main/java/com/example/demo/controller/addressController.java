package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.response.addressResponse;
import com.example.demo.service.addressService;

@RestController
@RequestMapping(value="/address")
public class addressController {
	
	@Autowired
	public addressService AddressService;
	
	@GetMapping("/{empId}")
	public ResponseEntity<addressResponse> findAddressByEmpId(@PathVariable("empId")int empId) {
		addressResponse AddressResponse=null;
		AddressResponse=AddressService.findAddressByEmpId(empId);
		
		return ResponseEntity.status(HttpStatus.OK).body(AddressResponse);
		
	}
	
//	
//	@GetMapping(value="/id/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
//	public address getAddressByID(@PathVariable("id") int id) {
//		return AddressService.getAddressByID(id);
//	}

}
