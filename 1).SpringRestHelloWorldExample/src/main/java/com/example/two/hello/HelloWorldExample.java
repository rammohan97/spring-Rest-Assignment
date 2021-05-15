package com.example.two.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldExample {
	@Autowired
	DemoExampleServiceHello hello;
	@GetMapping("hell")
	public String sayHello() {
		return hello.hello();
	}
	
}
