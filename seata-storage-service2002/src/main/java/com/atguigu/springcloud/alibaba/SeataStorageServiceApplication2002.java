package com.atguigu.springcloud.alibaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName SeataStorageServiceApplication2002
 * @Description TODO
 * @Author YH
 * @Date 2020/10/20 10:29
 * @Version 1.0
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.atguigu.springcloud.alibaba.dao")
public class SeataStorageServiceApplication2002 {
    public static void main(String[] args) {
    	SpringApplication.run(SeataStorageServiceApplication2002.class, args);
    }
}
