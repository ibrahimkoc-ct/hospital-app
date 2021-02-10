package com.ba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ba.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {

}
