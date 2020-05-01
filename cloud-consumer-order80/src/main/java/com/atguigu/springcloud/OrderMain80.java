package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author renyy
 * @create 2020-04-29 9:34
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderMain80.class, args);
      }
}
