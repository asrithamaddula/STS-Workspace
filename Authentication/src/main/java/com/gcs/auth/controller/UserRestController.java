package com.gcs.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcs.auth.model.User;
import com.gcs.auth.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
@Autowired
	private IUserService service; //HAS-A
	@PostMapping("/save")
public ResponseEntity<String> saveUser(@RequestBody User user) 
	{
		Integer id = service.saveUser(user);
		String body ="User '"+id+"' saved";
		return  ResponseEntity.ok(body);
}
}
