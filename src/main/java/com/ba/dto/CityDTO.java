package com.ba.dto;

import java.io.Serializable;
import java.util.List;

import com.ba.entity.Hospital;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CityDTO implements Serializable{
	
	private Long id;
	private String name;
	private List<HospitalDTO> hospitalDTO;
 
}
