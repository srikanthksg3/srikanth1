package com.javatpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.enums.DashboardRegionCountry;
import com.javatpoint.service.DrcServiceImpl;

@RestController
public class Controller {
	
	@Autowired
	private DrcServiceImpl drcServiceImpl;
	
	@PostMapping("/drc")
	public DashboardRegionCountry saveDashboardRegionCountry(@RequestBody DashboardRegionCountry dashboardRegionCountry) {
		return drcServiceImpl.saveDashboardRegionCountry(dashboardRegionCountry);
	}

}
