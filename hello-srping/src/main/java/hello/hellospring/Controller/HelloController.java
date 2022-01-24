package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "어서옵쇼 솔님");
		return "hello";
	}
	
	@GetMapping("hello-mvc")
	 public String helloMvc(@RequestParam(name = "name", required = false) String name, Model model) {
	 model.addAttribute("name", name);
	 return "hello-template";
	 }
	
}
