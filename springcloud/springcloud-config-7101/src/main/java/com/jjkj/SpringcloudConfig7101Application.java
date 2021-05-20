package com.jjkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfig7101Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfig7101Application.class, args);
	}
}
