package com.blogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RandBloggingApplication {

	private static final Logger log = LoggerFactory.getLogger(RandBloggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RandBloggingApplication.class, args);
		log.info("<<<<>>>>> Rand Blogging Application <<<<<>>>>>");
	}

}
