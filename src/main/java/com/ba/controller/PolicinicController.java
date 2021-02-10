package com.ba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ba.dto.PoliclinicDTO;
import com.ba.service.PolicilinicServiceImpl;

@RestController
@RequestMapping("/policinic")
@CrossOrigin(origins ="*")
public class PolicinicController {

	@Autowired
	private PolicilinicServiceImpl serviceImpl;
	
	@GetMapping("/{id}")
	public ResponseEntity<PoliclinicDTO> findbyId(@PathVariable Long id) {
		return ResponseEntity.ok(serviceImpl.findById(id));
		
	}
}
