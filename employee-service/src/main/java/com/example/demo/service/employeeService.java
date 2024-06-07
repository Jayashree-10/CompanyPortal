package com.example.demo.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.employee;
import com.example.demo.repo.employeeRepo;
import com.example.demo.response.addressResponse;
import com.example.demo.response.employeeResponse;

@Service
public class employeeService {
	
	@Autowired
    private employeeRepo EmployeeRepo;
	
	@Autowired
	public ModelMapper modelMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${addressservice.base.Url}")
	private String addressBaseUrl;
	
	
	public employeeResponse findByEmpId(int Id) {
		
		
		//addressResponse -- set the data by making the rest api call
		addressResponse AddressResponse=new addressResponse();
		
		Optional<employee> Employee=EmployeeRepo.findById(Id);
		
		employeeResponse EmployeeResponse=modelMapper.map(Employee, employeeResponse.class);

		AddressResponse=restTemplate.getForObject(addressBaseUrl+"/address/{Id}",addressResponse.class,Id);
		
		EmployeeResponse.setAddressResponse(AddressResponse);
		
		
		return EmployeeResponse;
	}
}
