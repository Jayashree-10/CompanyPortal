package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.address;

@Repository
public interface addressRepo extends JpaRepository<address,Integer> {

	address findAddressByEmpId(int empId);
	
//	//finding address based on empId
//	@Query(value="SELECT e.name,e.id,a.state,a.line1,a.line2,a.pincode FROM micro.employee e join micro.address a  on e.id=a.emp_id where emp_id=:empId")
//	address findAddressByEmpId(@Param("empId") int empId);
//
//	

}
