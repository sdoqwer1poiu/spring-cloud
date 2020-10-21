package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName PaymentFallbackService
 * @Description TODO
 * @Author YH
 * @Date 2020/10/9 11:47
 * @Version 1.0
 */
@Service
public class PaymentFallbackService implements  PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
