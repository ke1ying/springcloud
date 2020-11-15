package com.example.testspringbooteurekaserver8761;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class TestSpringbootEurekaServer8761Application {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringbootEurekaServer8761Application.class, args);
    }

}
