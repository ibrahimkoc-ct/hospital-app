package com.ba.dto;

import java.io.Serializable;
import java.util.List;



import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HospitalDTO implements Serializable{

	private Long id;
	private String name;
	private String address;
	private CityDTO city;
	private List<ClinicDTO> clinicList;

	



}
