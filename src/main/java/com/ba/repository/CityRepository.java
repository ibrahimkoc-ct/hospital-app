package com.ba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ba.entity.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
