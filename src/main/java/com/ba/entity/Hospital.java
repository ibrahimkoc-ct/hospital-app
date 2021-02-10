package com.ba.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Hospital")
public class Hospital implements Serializable {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	private static final long serialVersionUID = -6312254813537955232L;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@JsonIgnore
	@OneToMany( fetch = FetchType.LAZY)
	@JoinColumn(name = "hospital_id")
	private List<Clinic> clinicList;


}
