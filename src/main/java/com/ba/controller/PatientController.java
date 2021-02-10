package com.ba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ba.dto.PatientDTO;
import com.ba.service.PatientServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientServiceImpl service;
	
	@DeleteMapping
	public ResponseEntity<String> deletePatient(@PathVariable Long id){
		service.deletePatient(id);
		return ResponseEntity.ok("Patient delete");
		
	}
	
	@PostMapping	
	public ResponseEntity<PatientDTO> addPatient(PatientDTO dto){
		return ResponseEntity.ok(service.addPatient(dto));
			
	}
	@GetMapping("/tc/{tc}")
	public ResponseEntity<PatientDTO> findByTcPatient(@PathVariable String tc) {

		return ResponseEntity.ok(service.findByTcPatients(tc));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PatientDTO> findById(@PathVariable Long id) {

		return ResponseEntity.ok(service.findById(id));
	}
	
	
	@GetMapping
	public ResponseEntity<List<PatientDTO>> allPatient(){
		return ResponseEntity.ok(service.allPatient());
	}
	
	@PutMapping
	public ResponseEntity<PatientDTO> updatePatient(PatientDTO dto) {
		return ResponseEntity.ok(service.updatePatient(dto));
	}

}
