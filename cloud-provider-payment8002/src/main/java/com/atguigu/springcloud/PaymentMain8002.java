package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author renyuyu
 * @Description: 支付服务的主启动类
 * @date 2020-04-28 11:28 下午
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain8002.class, args);
      }
     
}
