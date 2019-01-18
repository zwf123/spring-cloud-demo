package com.example.eruekaClient3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class EruekaClient3Application {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello world:port-1113";
    }

    public static void main(String[] args) {
        SpringApplication.run(EruekaClient3Application.class, args);
    }

}

