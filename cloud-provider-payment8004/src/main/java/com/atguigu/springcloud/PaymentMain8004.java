package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author renyuyu
 * @Description: 8004
 * @date 2020-05-02 1:27 上午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain8004.class, args);
      }

}
