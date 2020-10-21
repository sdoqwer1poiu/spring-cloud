package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderZKMain80
 * @Description TODO
 * @Author YH
 * @Date 2020/9/29 10:42
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderZKMain80 {
    public static void main(String[] args) {
    	SpringApplication.run(OrderZKMain80.class, args);
    }
}
