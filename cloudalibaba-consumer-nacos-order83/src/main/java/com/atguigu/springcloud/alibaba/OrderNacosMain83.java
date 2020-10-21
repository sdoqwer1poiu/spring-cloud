package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderNacosMain83
 * @Description TODO
 * @Author YH
 * @Date 2020/10/11 15:20
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
    public static void main(String[] args) {
    	SpringApplication.run(OrderNacosMain83.class, args);
    }
}
