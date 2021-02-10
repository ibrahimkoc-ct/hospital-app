package com.ba.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppointmentDateDTO implements Serializable{
	
	private Long id;
	private String date;

}
