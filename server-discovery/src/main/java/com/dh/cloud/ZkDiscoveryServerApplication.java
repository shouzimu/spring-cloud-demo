package com.dh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZkDiscoveryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZkDiscoveryServerApplication.class, args);
    }
}
