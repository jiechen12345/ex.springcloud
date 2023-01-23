package com.example.ex_springcloud.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ExSpringcloudCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExSpringcloudCouponApplication.class, args);
    }

}
