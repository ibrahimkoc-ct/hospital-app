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

import com.ba.dto.DoctorDTO;
import com.ba.service.DoctorServiceImpl;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorServiceImpl service;
	
	@DeleteMapping
	public ResponseEntity<String> deleteDoctor(@PathVariable Long id){
		service.deleteDoctor(id);
		return ResponseEntity.ok("Doctor delete");
		
	}
	
	@PostMapping	
	public ResponseEntity<DoctorDTO> addDoctor(DoctorDTO dto){
		return ResponseEntity.ok(service.addDoctor(dto));
			
	}
	
	
	@GetMapping
	public ResponseEntity<List<DoctorDTO>> allDoctor(){
		return ResponseEntity.ok(service.allDoctor());
	}
	
	
	
	@PutMapping
	public ResponseEntity<DoctorDTO> updateDoctor(DoctorDTO dto) {
		return ResponseEntity.ok(service.updateDoctor(dto));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<DoctorDTO>> findByPoliclinicId(@PathVariable Long id){
		return ResponseEntity.ok(service.policlinicIdByDoctorDTO(id));
	}


}
