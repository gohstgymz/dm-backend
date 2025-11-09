package com.code.dmschedulerconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DmSchedulerConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmSchedulerConsumerApplication.class, args);
    }

}
