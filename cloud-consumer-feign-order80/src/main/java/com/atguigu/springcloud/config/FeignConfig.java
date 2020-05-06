package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author renyuyu
 * @Description: '
 * @date 2020-05-04 6:16 下午
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }

}
