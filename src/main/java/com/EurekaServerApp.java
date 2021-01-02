package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaServerApp {
    public static void main(String[] args){
        SpringApplication.run(EurekaServerApp.class, args);
    }

    @GetMapping("/index")
    public String getIndex(){
        return "this is index";
    }
}
