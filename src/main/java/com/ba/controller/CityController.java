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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ba.dto.CityDTO;
import com.ba.service.CityServiceImpl;

@RestController
@RequestMapping("/city")
@CrossOrigin(origins = "*")
public class CityController {
	
	@Autowired
	private CityServiceImpl service;
	
	@GetMapping
	public ResponseEntity<List<CityDTO>> getAllCity(){
		return ResponseEntity.ok(service.getAllCity());
	}
	
	@PostMapping
	public ResponseEntity<CityDTO> addEntity(@RequestBody CityDTO dto){
		return ResponseEntity.ok(service.addCity(dto));
	}
	
	@PutMapping
	public ResponseEntity<CityDTO> updateCity(@RequestBody CityDTO dto){
		return ResponseEntity.ok(service.updateCity(dto));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCity(@PathVariable Long id){
		service.deleteCity(id);
		return ResponseEntity.ok("City delete");
	}
	@GetMapping("/{id}")
	public ResponseEntity<CityDTO> findByIdCity(@PathVariable Long id){
		return ResponseEntity.ok(service.findById(id));
	}
}
