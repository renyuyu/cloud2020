package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-10 10:16 下午
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9004 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain9004.class, args);
      }

}
