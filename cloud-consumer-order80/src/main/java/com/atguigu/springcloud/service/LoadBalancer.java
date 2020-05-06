package com.atguigu.springcloud.service;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-02 3:46 下午
 */
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
