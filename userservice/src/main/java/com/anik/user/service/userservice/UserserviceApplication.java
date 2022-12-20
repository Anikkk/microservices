package com.anik.user.service.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
// @EnableDiscoveryClient
@EnableEurekaClient
// @ComponentScan("com.anik.user.service.userservice.repositories.UserRepository")
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

}
