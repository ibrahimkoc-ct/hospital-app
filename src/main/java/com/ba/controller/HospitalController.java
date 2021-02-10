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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ba.dto.HospitalDTO;
import com.ba.service.HospitalServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	private HospitalServiceImpl service;

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteHospital(@PathVariable Long id) {
		service.deleteHospital(id);
		return ResponseEntity.ok("Hospital delete");

	}

	@PostMapping
	public ResponseEntity<HospitalDTO> addHospital(@RequestBody HospitalDTO dto) {

		return ResponseEntity.ok(service.addHospital(dto));

	}

	@GetMapping
	public ResponseEntity<List<HospitalDTO>> allHospital() {

		return ResponseEntity.ok(service.allHospital());
	}

	@PutMapping
	public ResponseEntity<HospitalDTO> updateHospital(@RequestBody HospitalDTO dto) {
		return ResponseEntity.ok(service.updateHospital(dto));
	}
	@GetMapping("/{id}")
	public ResponseEntity<HospitalDTO> HospitalById(@PathVariable Long id) {
		return ResponseEntity.ok(service.HospitalById(id));
	}

}
