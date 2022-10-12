package com.javatpoint.springbootexample.service;

import java.util.List;

import com.javatpoint.springbootexample.entity.Department;

public interface DepartmentService {
	
	// Save Operation
	Department saveDepartment(Department department);
	
	//Read Operation
	List<Department> fetchDepartmentList();
	
	//Update operation
	Department updateDepartment(Department department, Long departmentId);
	
	//Delete Operation
	void deleteDepartmentById( Long departmentId);
	
	// Read particular department name
	Department findDepartmentById(Long departmentId);

	//delete department by name
	void deleteDepartmentByname(String departmentName);
	
}
