package com.javatpoint.enums;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class Dashboard {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dashboardId;
	private long dashboardName;
	
	@OneToMany(mappedBy = "dashboard")
	private List<DashboardRegionCountry> dashboardRegionCountries;

}
