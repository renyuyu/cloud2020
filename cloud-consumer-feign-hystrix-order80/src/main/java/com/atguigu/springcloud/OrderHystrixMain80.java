package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-06 10:09 下午
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderHystrixMain80.class, args);
      }
     
}
