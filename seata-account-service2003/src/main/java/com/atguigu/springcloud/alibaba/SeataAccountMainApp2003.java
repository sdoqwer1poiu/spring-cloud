package com.atguigu.springcloud.alibaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName SeataAccountMainApp2003
 * @Description TODO
 * @Author YH
 * @Date 2020/10/20 15:20
 * @Version 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.atguigu.springcloud.alibaba.dao")
public class SeataAccountMainApp2003 {
    public static void main(String[] args) {
    	SpringApplication.run(SeataAccountMainApp2003.class, args);
    }
}
