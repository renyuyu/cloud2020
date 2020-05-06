package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-06 10:24 下午
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfoOK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }

}
