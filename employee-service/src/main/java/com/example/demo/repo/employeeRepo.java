package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.employee;

public interface employeeRepo extends JpaRepository<employee,Integer> {

}
