package com.HelloWorldRest.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.HelloWorldRest.models.HelloWorldBean;

@RestController
public class HelloWorld {

	@GetMapping("/printHelloWorld")
	public String printHelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/printHelloWorld/{name}")
	public String printHelloWorld(@PathVariable("name") String name) {
		return "Hello World " + name;
	}
	
	@GetMapping(path = "/helloworldbean")
	public HelloWorldBean hello() {
		return new HelloWorldBean("Hello every one!! Welcome to sw409");
	}
	
	@GetMapping(path = "/helloworld/path-variable/{name}")
	public HelloWorldBean helloPathVar(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello world , %s", name));
	}

	
	
}
