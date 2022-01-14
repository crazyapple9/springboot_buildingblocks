package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String helloWorld()
	{
		return "Hey Folks! :) ";
	}
	
	@GetMapping("/userinfo")
	public UserDetails userInfoBean()
	{
		return new UserDetails("Urmimala", "Nath", 001, "Kolkata");
	}

}
