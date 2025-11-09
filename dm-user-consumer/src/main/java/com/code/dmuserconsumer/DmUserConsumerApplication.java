package com.code.dmuserconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
public class DmUserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmUserConsumerApplication.class, args);
    }

}
