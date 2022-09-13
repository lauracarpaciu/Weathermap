package com.lauracarpaciu.demo;


//@SpringBootApplication is a convenience annotation that adds all of the following:
//@Configuration: Tags the class as a source of bean definitions for the application context.	
//@EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
//@ComponentScan: Tells Spring to look for other components, configurations, and services

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;



@SpringBootApplication(scanBasePackages={"com/lauracarpaciu/demo"})
@EnableAsync
@EnableAutoConfiguration
@EntityScan("com/lauracarpaciu/demo.entity")
@ComponentScan(basePackages = {"com/lauracarpaciu/demo.*"})
@EnableJpaRepositories("com/lauracarpaciu/demo.*")
@EnableJpaAuditing

public class OwmApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwmApiApplication.class, args);
	}
	
}