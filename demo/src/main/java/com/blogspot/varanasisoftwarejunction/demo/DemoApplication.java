package com.blogspot.varanasisoftwarejunction.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello");
	}
	@GetMapping("/hello")

	public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s", name);
	}
	@GetMapping("/add")

	public String doAdd(@RequestParam(value = "a", defaultValue = "0") int a,@RequestParam(value = "b", defaultValue = "0") int b) {
		return String.format("%s +  %s = %s", a,b,a+b);
	}

}
