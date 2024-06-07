package com.example.demo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class addressResponse {
	
	private int id;
	private String line1;
	private String line2;
	private String state;
	private Long pincode;
	

}
