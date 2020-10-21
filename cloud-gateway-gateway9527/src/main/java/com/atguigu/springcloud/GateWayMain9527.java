package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName GateWayMain9527
 * @Description TODO
 * @Author YH
 * @Date 2020/10/10 15:31
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GateWayMain9527 {
    public static void main(String[] args) {
    	SpringApplication.run(GateWayMain9527.class, args);
    }
}
