package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-09 9:33 下午
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
     public static void main(String[] args) {
           SpringApplication.run(ConfigClientMain3366.class, args);
      }
     
}
