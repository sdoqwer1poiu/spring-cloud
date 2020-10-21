package com.atguigu.springcloud;

import com.atguigu.springcloud.com.atguigu.myrule.MySelfRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName OrderMain80
 * @Description TODO
 * @Author YH
 * @Date 2020/9/27 16:17
 * @Version 1.0
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient//试用Eureka，Consul，Zookeeper等服务注册中心
@RibbonClient(name = "CLOUD-ORDER-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
    	SpringApplication.run(OrderMain80.class, args);
    }
}
