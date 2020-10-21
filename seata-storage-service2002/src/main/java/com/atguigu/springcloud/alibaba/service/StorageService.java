package com.atguigu.springcloud.alibaba.service;

/**
 * @ClassName StorageService
 * @Description TODO
 * @Author YH
 * @Date 2020/10/20 10:16
 * @Version 1.0
 */
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);
}
