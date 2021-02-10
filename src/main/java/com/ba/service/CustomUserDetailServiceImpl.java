package com.ba.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ba.entity.Patient;
import com.ba.repository.PatientRepository;

@Service
public class CustomUserDetailServiceImpl implements UserDetailsService{
	
	@Autowired
	private PatientRepository repository;
 
	@Override
	public UserDetails loadUserByUsername(String tc) throws UsernameNotFoundException {
		Patient patient= repository.findByTc(tc);
		return new User(patient.getTc(),patient.getPassword(),new ArrayList<>());
	}

}
