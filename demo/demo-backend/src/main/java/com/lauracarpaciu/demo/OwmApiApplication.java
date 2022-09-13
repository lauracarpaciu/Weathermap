package com.lauracarpaciu.demo;

import java.lang.System.Logger;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com/lauracarpaciu/demo"})
@EnableAsync
@EnableAutoConfiguration
@EntityScan("com/lauracarpaciu/demo.entity")
@ComponentScan(basePackages = {"com/lauracarpaciu/demo.*"})
@EnableJpaRepositories("com/lauracarpaciu/demo.*")
@EnableJpaAuditing

public class OwmApiApplication {

	public static final Logger Log = (Logger) LoggerFactory.logger(OwmApiApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(OwmApiApplication.class, args);
	}
	
}