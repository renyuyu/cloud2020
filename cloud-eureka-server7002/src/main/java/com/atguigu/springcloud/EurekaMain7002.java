package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author renyuyu
 * @Description: eurekaServer7002
 * @date 2020-05-01 12:43 上午
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7002 {
     public static void main(String[] args) {
           SpringApplication.run(EurekaMain7002.class, args);
      }

}
