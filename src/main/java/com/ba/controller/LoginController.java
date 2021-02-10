package com.ba.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ba.dto.AuthRequest;
import com.ba.security.JwtUtil;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	
	@PostMapping("/login")
	public String generateToken(@RequestBody AuthRequest request) throws Exception {
		
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getTc(), request.getPassword()));
		}
		catch (Exception e) {
			throw new Exception("Invalid username and password");
		}
		
		return jwtUtil.generateToken(request.getTc());
	}
	

}
