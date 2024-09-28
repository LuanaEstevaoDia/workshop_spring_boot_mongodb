package com.nelioalves.worhshomongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.worhshomongo.domain.User;
import com.nelioalves.worhshomongo.sevices.UserService;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
