package com.example.demo_trainingH2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoTrainingH2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoTrainingH2Application.class, args);
	}

    @GetMapping("/hello")
    String home() {
        return "hi ";
    }
}
