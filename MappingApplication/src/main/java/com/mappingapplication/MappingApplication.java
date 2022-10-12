package com.mappingapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mappingapplication.entity.Address;
import com.mappingapplication.entity.StudentInformation;
import com.mappingapplication.repo.AddressRepo;
import com.mappingapplication.repo.StudentInformationRepo;

@SpringBootApplication
public class MappingApplication implements CommandLineRunner{

	@Autowired
	StudentInformationRepo ob;
	@Autowired
	AddressRepo ob1;
	
	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		StudentInformation student = new StudentInformation(1,"Srikanth");
		ob.save(student);
		Address address = new Address(1,"Hyderabad",student);
		ob1.save(address);
		
	}

}
