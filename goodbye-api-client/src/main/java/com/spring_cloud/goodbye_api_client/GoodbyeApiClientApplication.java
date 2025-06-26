package com.spring_cloud.goodbye_api_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GoodbyeApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodbyeApiClientApplication.class, args);
	}

}

@RestController
@RequestMapping("goodbye")
class GoodbyeController {
	@GetMapping
	public String goodbye() {
		return "Goodbye, Eureka!";
	}
}