package com.example.ex_springcloud.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1.遠程調用其他服務
 *  1.引入open-feign
 *  2.做一個接口告訴springcloud 這個接口需要調用遠程服務
 *      a.接口內宣告FeignClient("coupon")調用哪一個server，還有哪一個api url
 *  3.開啟遠程調用功能EnableFeignClients(basePackages = "com.example.ex_springcloud.member.feign")
 *   1.只要有啟用這個註記，spring就會去找所有有註記@FeignClient的接口
 */
@EnableFeignClients(basePackages = "com.example.ex_springcloud.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class ExSpringcloudMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExSpringcloudMemberApplication.class, args);
    }

}
