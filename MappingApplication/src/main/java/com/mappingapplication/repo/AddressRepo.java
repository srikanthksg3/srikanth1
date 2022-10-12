package com.mappingapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappingapplication.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
