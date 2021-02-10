package com.ba.dto;

import java.util.List;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClinicDTO {
	
	private Long id;

	private String name;	

	private String phoneNumber;

	private String address;


	private HospitalDTO hospital;
	

	private List<PoliclinicDTO> policlinicList;

}
