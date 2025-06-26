package com.spring_cloud.hello_api_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApiClientApplication.class, args);
	}

}

@RestController
@RequestMapping("hello")
class HelloController {
	@GetMapping
	public String hello() {
		return "Hello, Eureka!";
	}
}
