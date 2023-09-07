package com.consumer1.webmvc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Webmvc1Application {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		SpringApplication.run(Webmvc1Application.class, args);
	}
	@Bean("rt")
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}
