package com.microservices.Microservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping("hello-world-bean/your-name/{name}")
	public HelloWorldBean helloWorldGetName(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

}
