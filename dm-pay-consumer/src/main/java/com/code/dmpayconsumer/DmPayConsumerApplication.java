package com.code.dmpayconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DmPayConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmPayConsumerApplication.class, args);
    }

}
