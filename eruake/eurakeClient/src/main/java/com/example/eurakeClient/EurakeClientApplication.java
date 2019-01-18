package com.example.eurakeClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurakeClientApplication {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello world:port-1111";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurakeClientApplication.class, args);
    }

}

