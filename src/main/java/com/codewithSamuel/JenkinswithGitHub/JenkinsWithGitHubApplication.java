package com.codewithSamuel.JenkinswithGitHub;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsWithGitHubApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsWithGitHubApplication.class);


	@PostConstruct
	public void intt(){
		logger.info("Application started....");
	}

	public static void main(String[] args) {
		logger.info("Application executed....");
		SpringApplication.run(JenkinsWithGitHubApplication.class, args);
	}

}
