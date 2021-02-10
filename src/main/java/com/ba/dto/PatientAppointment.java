package com.ba.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PatientAppointment {
	
	private Long id;
	private String date;
	private Long hour;
	private String doctorName;
	private String doctorLastname;
	private String policlinicName;
	private String clinicName;
	private String hostpitalName;
	private String cityName;
	

}
