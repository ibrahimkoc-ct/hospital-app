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

import com.ba.dto.AppointmentDTO;
import com.ba.dto.AppointmentDateDTO;
import com.ba.dto.PatientAppointment;
import com.ba.service.AppointmentServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentServiceImpl service;
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAppointment(@PathVariable Long id) {
		service.deleteAppointment(id);
		return ResponseEntity.ok("Appointment delete");

	}

	@PostMapping
	public ResponseEntity<AppointmentDTO> addAppointment(@RequestBody AppointmentDTO dto) {

		return ResponseEntity.ok(service.addAppointment(dto));

	}

	@GetMapping
	public ResponseEntity<List<AppointmentDTO>> allAppointment() {

		return ResponseEntity.ok(service.allAppointment());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AppointmentDTO> findByIdAppointment(@PathVariable Long id) {

		return ResponseEntity.ok(service.findByIdAppointment(id));
	}
	
	@GetMapping("/patient/{id}")
	public ResponseEntity<List<AppointmentDTO>> findByPatinetId(@PathVariable Long id) {

		return ResponseEntity.ok(service.findByIdPatientId(id));
	}
	
	@GetMapping("/detail/{id}")
	public ResponseEntity<List<PatientAppointment>> findByPatinetAppointment(@PathVariable Long id) {

		return ResponseEntity.ok(service.findByIdPatientAppointment(id));
	}
	
	
	
	@PutMapping
	public ResponseEntity<AppointmentDTO> updateHospital(AppointmentDTO dto) {
		return ResponseEntity.ok(service.updateAppointment(dto));
	}
	
	@PostMapping("/date")
    public List<Long> getAppointmets(@RequestBody AppointmentDateDTO dto){
        return service.getAppointments(dto);
    }

	
}
