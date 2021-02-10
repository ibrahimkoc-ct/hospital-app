package com.ba.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PoliclinicDTO implements Serializable{
	
	
	private Long id;
	

	
	private String name;	

	
	private String description;
	
	
	private ClinicDTO clinic;
	

	private List<DoctorDTO> doctors;

}
