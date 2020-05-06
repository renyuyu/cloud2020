package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-06 10:58 下午
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {

     public static void main(String[] args) {
           SpringApplication.run(HystrixDashboardMain9001.class, args);
      }
     

}
