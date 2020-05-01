package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-02 1:56 上午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderZKMain80.class, args);
      }

}
