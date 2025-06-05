package com.example.FreeCodeCamp;

import org.apache.juli.logging.Log;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FreeCodeCampApplicationTests {

	private static final Logger log=LoggerFactory.getLogger(FreeCodeCampApplicationTests.class);

	public static void main(String[] args) {
		SpringApplication.run(FreeCodeCampApplicationTests.class,args);
	}

}
