package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisConfig
 * @Description TODO
 * @Author YH
 * @Date 2020/10/19 10:22
 * @Version 1.0
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.alibaba.dao"})//告诉容器，所有的mybatis.xml跟dao有关
public class MyBatisConfig {
}
