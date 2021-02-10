package com.ba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ba.entity.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Long>{
	
	@Query("Select u FROM Doctor u WHERE u.policlinic.id=:id")
	List<Doctor> findPoliclinicId(Long id);

}
