package com.ba.dto;

import java.io.Serializable;
import java.util.List;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DoctorDTO implements Serializable{
	
	private Long id;
	private String name;
	private String lastname;
	private String phoneNumber;
	private String address;
	private String mail;
	private String registrationNumber;
	private PoliclinicDTO policlinic;
	private List<AppointmentDTO> appointmentsDTO;






}
