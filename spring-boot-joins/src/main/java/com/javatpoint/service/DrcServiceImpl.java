package com.javatpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.dao.Repo;
import com.javatpoint.enums.DashboardRegionCountry;

@Service
public class DrcServiceImpl implements DrcService{
	
	@Autowired
	private Repo repo;

	@Override
	public DashboardRegionCountry saveDashboardRegionCountry(DashboardRegionCountry dashboardRegionCountry) {
		return repo.save(dashboardRegionCountry);
	}

}
