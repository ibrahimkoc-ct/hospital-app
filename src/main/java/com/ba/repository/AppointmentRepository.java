package com.ba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ba.dto.PatientAppointment;
import com.ba.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	
	@Query("SELECT u.hour FROM Appointment u WHERE u.doctor.id = :id and u.date = :date")
    List<Long> findAppointmentsDate(Long id, String date);
	
	@Query("SELECT u FROM Appointment u WHERE u.patient.id = :id")
	List<Appointment> findByPatientId(Long id);
	
	
	@Query(value ="SELECT new com.ba.dto.PatientAppointment(a.id as id, a.date as date,a.hour as hour, d.name as doctorName, d.lastname as doctorLastname,p.name "
			+ "as policlinicName,cli.name as clinicName,h.name as hostpitalName,c.name as cityName)"
			+ " from Appointment a INNER JOIN Doctor d ON a.doctor.id=d.id INNER JOIN Patient pa ON a.patient.id=pa.id "
			+ "INNER JOIN Policlinic p ON d.policlinic.id=p.id INNER JOIN Clinic cli ON p.clinic.id=cli.id INNER JOIN Hospital h ON "
			+ "cli.hospital.id=h.id INNER JOIN City c ON h.city.id=c.id"
			+ " where pa.id= :id")
	List<PatientAppointment> patientAppointmentList(Long id);
	

}
