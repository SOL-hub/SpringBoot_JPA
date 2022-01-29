package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sol2Sol2Application {

	public static void main(String[] args) {
		
		Hello hello = new Hello();
		
		hello.setData("hello");
		String data = hello.getData();
		
		SpringApplication.run(Sol2Sol2Application.class, args);
	}

}
