package com.jjkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudConsumer8000Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumer8000Application.class, args);
	}

}
