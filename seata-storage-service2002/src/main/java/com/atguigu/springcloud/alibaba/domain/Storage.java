package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @ClassName Storage
 * @Description TODO
 * @Author YH
 * @Date 2020/10/20 10:07
 * @Version 1.0
 */
@Data
public class Storage {
    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;

    //已用库存
    private Integer used;

    //剩余库存
    private Integer residue;
}
