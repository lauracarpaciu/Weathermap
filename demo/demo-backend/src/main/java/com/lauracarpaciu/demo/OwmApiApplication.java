package com.lauracarpaciu.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.lauracarpaciu.demo"})
public class OwmApiApplication {

	public static final Logger Log = LoggerFactory.getLogger(OwmApiApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(OwmApiApplication.class, args);
	}
	
}