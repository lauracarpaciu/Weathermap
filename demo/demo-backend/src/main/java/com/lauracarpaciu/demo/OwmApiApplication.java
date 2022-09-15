package com.lauracarpaciu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication(scanBasePackages={"com.lauracarpaciu.demo"})
@EnableAsync
@EnableAspectJAutoProxy
@EnableAutoConfiguration
@EntityScan("com.lauracarpaciu.demo.entity")
@ComponentScan(basePackages = { "com.lauracarpaciu.demo.service,com.lauracarpaciu.demo.*,com.lauracarpaciu.demo.controller"})
@EnableJpaRepositories("com.lauracarpaciu.demo.*")
@EnableJpaAuditing
public class OwmApiApplication {

	public static final Logger Log = LoggerFactory.getLogger(OwmApiApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(OwmApiApplication.class, args);
	}
	
}