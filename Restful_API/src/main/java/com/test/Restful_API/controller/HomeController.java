package com.test.Restful_API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Test용 컨트롤러
@RestController
public class HomeController {

	@GetMapping(path="/home")
	public String home() {
		return "home";
	}
	
	@GetMapping(path="/home-bean")
	public HomeBean homeBean() {
		return new HomeBean("homeTest2");
	}
	
	@GetMapping(path="/home-bean/path-variable/{name}")
	public HomeBean homeBean(@PathVariable String name) {
		return new HomeBean(String.format("home, %s" + name));
	}
	
	
}
