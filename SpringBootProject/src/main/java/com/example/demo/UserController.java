package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;

@RestController
@RequestMapping("/demo")
@CrossOrigin
public class UserController {
	
	
	@Autowired
	MyUserDetailsService userdetal;
	
	@GetMapping(path = "/authentication")
	public AuthenticationBean loginInfo()
	{
			
		System.out.println("current user id is this-----"+userdetal.getUserId());
		return new AuthenticationBean(""+userdetal.getUserId());
		
	}

}
