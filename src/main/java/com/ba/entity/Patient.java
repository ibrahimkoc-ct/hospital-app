package com.ba.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Patient")
public class Patient implements Serializable{


	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	private static final long serialVersionUID = -8582038605224428119L;

	@Column(name = "name")
	private String name;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name="tc")
	private String tc;
	
	@Column(name = "age")
	private Long age;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "password")
	private String password;
	
	@JsonIgnore
	@OneToMany(mappedBy = "patient")
	private List<Appointment> appointments;
	
		
	
}
