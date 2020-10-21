package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName SeataOrderMainApp2001
 * @Description TODO
 * @Author YH
 * @Date 2020/10/19 10:34
 * @Version 1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动创建的配置
@SpringBootApplication //可以不用写配置文件，在application.yml切换数据源
public class SeataOrderMainApp2001 {
    public static void main(String[] args) {
    	SpringApplication.run(SeataOrderMainApp2001.class, args);
    }
}
