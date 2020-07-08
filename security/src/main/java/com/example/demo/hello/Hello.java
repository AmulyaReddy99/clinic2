package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.AuthenticationRequest;
import com.example.demo.models.AuthenticationResponse;
import com.example.demo.services.MyUserDetailsService;
import com.example.demo.utils.JwtUtil;

@RestController
public class Hello {
	
	@Autowired
	public AuthenticationManager authenticationManager;
	
	@Autowired
	public MyUserDetailsService userDetailsService;
	
	@Autowired
	public JwtUtil jwtTokenUtil;
	
	@RequestMapping("/")
	public String hello() {
		return "Successful";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "Admin";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "User";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/authenticate")
	public ResponseEntity<?> authenticate(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
		try{
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
		}
		catch(BadCredentialsException e) {
			throw new Exception("Incorrect username or password",e);
		}
		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
		
		final String jwt = jwtTokenUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}
		
}
