package com.clover.appconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class AppconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppconfigApplication.class, args);
	}

}
