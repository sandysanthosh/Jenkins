package com.example.jenkins.api;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.spi.LoggerContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	@PostConstruct
	public void init()
	{
		System.out.println("running..");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
