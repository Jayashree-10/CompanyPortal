package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.address;

import com.example.demo.repo.addressRepo;
import com.example.demo.response.addressResponse;

@Service
public class addressService {
	
	@Autowired
	public addressRepo AddressRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public addressResponse findAddressByEmpId(int empId) {
		address Address=AddressRepo.findAddressByEmpId(empId);
		
		addressResponse AddressResponse = modelMapper.map(Address,addressResponse.class);
		
		return AddressResponse;
		
	}
//	public address getAddressByID(int id) {
//		address Address= AddressRepo.findById(id).get();
//		return Address;
//	}

}
