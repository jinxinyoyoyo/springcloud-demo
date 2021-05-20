package com.jjkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.jjkj.service"})
public class SpringcloudConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerFeignApplication.class, args);
	}

}
