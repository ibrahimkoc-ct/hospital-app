package com.ba.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

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
@Table(name = "Doctor")
public class Doctor implements Serializable {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	private static final long serialVersionUID = -8640191738694646460L;

	@Column(name = "name")
	private String name;

	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "mail")
	private String mail;
	
	@Column(name = "registration_number")
	private String registrationNumber;
	
	@ColumnDefault("123")
	@Column(name = "password")
	private String password;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "policlinic_id")
	private Policlinic policlinic;
	
	@JsonIgnore
	@OneToMany(mappedBy = "doctor")
	private List<Appointment> appointments;
	

}
