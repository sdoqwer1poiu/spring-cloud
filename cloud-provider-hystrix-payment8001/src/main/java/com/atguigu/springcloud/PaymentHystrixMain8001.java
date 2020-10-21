package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentHystrixMain8001
 * @Description TODO
 * @Author YH
 * @Date 2020/10/9 9:32
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient //开启服务发现客户端，
@EnableCircuitBreaker //开启断路器功能
//@SpringCloudApplication  //可以取代上面三个
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
    	SpringApplication.run(PaymentHystrixMain8001.class, args);
    }
}
