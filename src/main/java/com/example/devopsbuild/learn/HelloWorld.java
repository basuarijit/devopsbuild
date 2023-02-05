package com.example.devopsbuild.learn;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping(method=RequestMethod.GET, path="/hello/{name}")
	public String helloWorld(@PathVariable String name) {
		return "Hello "+name;
	}

}
