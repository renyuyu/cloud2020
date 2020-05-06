package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-04 5:16 下午
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    /**
     * 查询支付信息
     * @param id id
     * @return CommonResult
     */
    @GetMapping(value = "/payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id")Long id);

    /**
     * 演示feign的超时功能
     * @return String ""
     */
    @GetMapping(value = "/payment/timeout")
    String getTimeOut();
}
