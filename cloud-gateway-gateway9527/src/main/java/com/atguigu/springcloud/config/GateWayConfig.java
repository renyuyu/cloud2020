package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-08 8:32 下午
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote_atguigu1",r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        routes.route("path_rote_atguigu2",r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        return routes.build();
    }

}
