package com.javatpoint.springbootexample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.springbootexample.entity.Department;
import com.javatpoint.springbootexample.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/department")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentsList(){
		return departmentService.fetchDepartmentList();
	}
	
	@PutMapping("/department/{id}")
	public Department updateDepartment(@RequestBody Department department,
			@PathVariable("id") Long departmentId ) {
		return departmentService.updateDepartment(department, departmentId);
	}
	
	/*@DeleteMapping("/department/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Deleted Successfully";
	}*/
	/*@DeleteMapping("/department")
	public String deleteDepartmentById(@RequestParam Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Deleted Successfully";
	}*/
	@DeleteMapping("/department")
	public String deleteDepartmentById(@RequestParam String departmentName) {
		System.out.println(departmentName);
		departmentService.deleteDepartmentByname(departmentName);
		
		return "Deleted Successfully";
	}
	
	@GetMapping("/dep/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.findDepartmentById(departmentId);
	}

}
