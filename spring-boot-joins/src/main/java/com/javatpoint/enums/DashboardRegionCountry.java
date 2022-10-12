package com.javatpoint.enums;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
public class DashboardRegionCountry {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long dashboardId;
	
	@OneToOne(targetEntity = Country.class)
	@JoinColumn(name = "countryId")
	private Country country;
	
	@OneToOne(targetEntity = Region.class)
	@JoinColumn(name = "regionId")
	private Region region;
	
	@ManyToOne()
	@JoinColumn(name = "dashboardId")
	private Dashboard dashboard;

}
