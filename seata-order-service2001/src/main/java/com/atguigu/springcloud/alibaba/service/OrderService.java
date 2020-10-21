package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Order;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author YH
 * @Date 2020/10/19 9:33
 * @Version 1.0
 */
public interface OrderService {
    void create(Order order);
}
