package com.mappingapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappingapplication.entity.StudentInformation;

public interface StudentInformationRepo extends JpaRepository<StudentInformation, Integer>{

}
