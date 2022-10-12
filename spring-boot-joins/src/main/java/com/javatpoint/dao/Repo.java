package com.javatpoint.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.enums.DashboardRegionCountry;

@Repository
public interface Repo extends JpaRepository<DashboardRegionCountry, Long >{

}
