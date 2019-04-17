package com.techies.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @EnableWebSecurity */
/* @EnableAuthorizationServer */
@SpringBootApplication(/* exclude = { SecurityAutoConfiguration.class } */)
public class SpringSecurityAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAuthServerApplication.class, args);
	}

}
