package com.example.demo.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class employeeResponse {

	private int id;
	private String name;
	private String email;
	private String bloodGroup;
	
	private addressResponse AddressResponse;
	
	

}
