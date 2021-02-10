package com.ba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ba.dto.ClinicDTO;
import com.ba.service.ClinicServiceImpl;

@RestController
@RequestMapping("/clinic")
@CrossOrigin(origins = "*")
public class ClinicController {
	
	@Autowired
	private ClinicServiceImpl service;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<ClinicDTO> findById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findbyIdClinic(id));
	}

}
