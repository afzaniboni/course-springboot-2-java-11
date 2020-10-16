package com.educandoweb.course.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> listUsers = new ArrayList<>();
		listUsers.add(new User(1L, "Maria", "maria@teste.com.br", "99999999", "123456"));
		listUsers.add(new User(2L, "João", "joao@teste.com.br", "98989898", "123456"));
		listUsers.add(new User(3L, "Roberto", "roberto@teste.com.br", "97979797", "123456"));
		
		return ResponseEntity.ok(listUsers);
	}

}
