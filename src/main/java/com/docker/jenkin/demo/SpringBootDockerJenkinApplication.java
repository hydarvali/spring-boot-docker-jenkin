package com.docker.jenkin.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDockerJenkinApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootDockerJenkinApplication.class);
	
	public void init() {
		logger.info("Application and init() method started...");
		logger.info("Added jenkin pipeline and init() method started...");
	}

	public static void main(String[] args) {
		logger.info("Application and main() method started...");
		logger.info("Added jenkin pipeline and main() method started...");
		SpringApplication.run(SpringBootDockerJenkinApplication.class, args);
	}

}
