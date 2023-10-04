package com.codewithSamuel.JenkinswithGitHub;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class JenkinsWithGitHubApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsWithGitHubApplication.class);
	@Test
	void contextLoads() {
		logger.info("Test executing...");
		assertEquals(true, true);
	}

}
