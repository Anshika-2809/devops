package com.nagarro.userService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class userController {

	@GetMapping(value= "/user")
	public String getUser() {
		return "Hello User";
	}
}
