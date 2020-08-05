package com.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class myadminproviderApp {

    public static void main(String[] args) {
        SpringApplication.run(myadminproviderApp.class, args);
    }

}
