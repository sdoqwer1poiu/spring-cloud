package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @ClassName StorageDao
 * @Description TODO
 * @Author YH
 * @Date 2020/10/20 10:13
 * @Version 1.0
 */
public interface StorageDao {
    //扣减库存信息
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
