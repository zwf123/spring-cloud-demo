package com.example.eruekaClient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class EruekaClient2Application {

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello world:port-1112";
	}

	public static void main(String[] args) {
		SpringApplication.run(EruekaClient2Application.class, args);
	}

}

