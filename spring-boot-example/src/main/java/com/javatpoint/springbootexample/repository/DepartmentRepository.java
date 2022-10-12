package com.javatpoint.springbootexample.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.springbootexample.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Optional<Department> findByDepartmentName(String departmentName);

}
