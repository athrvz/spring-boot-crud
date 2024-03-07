package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @ComponentScan("com.example.demo.*")
// @EnableJpaRepositories("com.example.demo.repositories")
@SpringBootApplication
// @RestController
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

	// @RequestMapping("/")
	// String home() {
	// 	System.out.println("Got the request on /");
	// 	return "Hello World";
	// }

}
