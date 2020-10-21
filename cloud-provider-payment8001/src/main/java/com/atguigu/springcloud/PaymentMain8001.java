package com.atguigu.springcloud;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @ClassName PaymentMain8001
 * @Description TODO
 * @Author YH
 * @Date 2020/9/26 16:28
 * @Version 1.0
 */
@MapperScan(value = "com.atguigu.springcloud.dao")//配了这个后就不用每个Dao文件加@Mapper注解了。
@SpringBootApplication
@EnableDiscoveryClient//试用Eureka，Consul，Zookeeper等服务注册中心
public class PaymentMain8001 {
    public static void main(String[] args) {
    	SpringApplication.run(PaymentMain8001.class, args);
    }
}
