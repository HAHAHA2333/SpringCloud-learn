package com.itheima.eurekaribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaRibbonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonClientApplication.class, args);

    }
}
