package com.test.JPA_Test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {
	
	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "힘내자 솔");
		return "hello";
	}

	
}
