package com.ba.dto;

import java.io.Serializable;
import java.util.List;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PatientDTO implements Serializable{

	private Long id;
	private String name;
	private String phoneNumber;
	private String address;
	private String mail;
	private String tc;
	private Long age;
	private String gender;
	private List<AppointmentDTO> appointmentsDTO;
	private String password;


}
