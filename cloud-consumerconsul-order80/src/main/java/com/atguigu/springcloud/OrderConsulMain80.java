package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-02 2:27 上午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderConsulMain80.class, args);
      }

}
