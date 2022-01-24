package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@GetMapping("hello-string")
	@ResponseBody //이것의 의미는 html에 나오는 body태그가 아니라, 
	//http에서 header부와 body가 있는데 body부의 내용을 직접내가 넣어주겠다라는 것이다. 
	public String helloString(@RequestParam("name") String name) {
		return "hello" +name; //내가 만약 spring이라고 name 값을 넣으면 hello spring" 이라고 바뀐다.
		//얘는 그냥 문자 그대로 클라이언트한테 보여진다.
		//템플릿엔진은 뷰가 있는 상황에서 조작하는 방식 vs @ResponseBody return에 있는 것을 그대로 내려준다. 
		//뷰없이 바로 사용하는 @ResponseBody
	}
	
	@GetMapping("hello-api")
	 @ResponseBody
	 public Hello helloApi(@RequestParam("name") String name) {
		Hello hello = new Hello();
		hello.setName(name);
		return hello;
	 }
	
	 static class Hello {
	 private String name;
	 	public String getName() {
	 		return name;
	 }
	 	public void setName(String name) {
	 		this.name = name;
	 }
	 	
	 	//getter, setter를 위에서해주면 이런 매서드에 의해서 접근을 할 수 있다. 프로퍼티 접근방식임 
	 }}
