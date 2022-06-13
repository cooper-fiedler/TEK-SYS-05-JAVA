package com.fiedlercooper.dbConnection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fiedlercooper.dbConnection.entity.UserEntity;
import com.fiedlercooper.dbConnection.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(path = "/data")
public class MainController {


	@Autowired
	private UserRepository userRepo;

	@PostMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		UserEntity newUser = new UserEntity();
		newUser.setName(name);
		log.info("Added new name: " + name);
		newUser.setEmail(email);
		log.info("Added new email address: " + email);
		userRepo.save(newUser);
		return ("Saved new user!");
	}

	@GetMapping(path = "/getall")
	public @ResponseBody Iterable<UserEntity> getAllUsers() {
		log.info("Got all entries!");
		return userRepo.findAll();
	}
	
	@GetMapping(path = "/getbyname")
	public List<UserEntity> findByName(@RequestParam String name){
		return userRepo.findByName(name);
		
	}

	@DeleteMapping(path = "/delete")
	public @ResponseBody String deleteUser(@RequestParam Integer id) {
		try {
			userRepo.deleteById(id);
			return ("Deleted user!");
		} catch (EmptyResultDataAccessException e) {
			log.warn("User not found!");
			return ("User not found!");
		}

	}
		
}