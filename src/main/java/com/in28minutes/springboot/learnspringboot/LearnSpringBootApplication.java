package com.in28minutes.springboot.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan("com.in28minutes.springboot")
@SpringBootApplication
//(scanBasePackages = {"com.in28minutes.springboot.learnspringboot"})
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

}
