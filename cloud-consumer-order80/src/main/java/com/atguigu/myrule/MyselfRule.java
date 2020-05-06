package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-02 3:03 下午
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myrule(){
        //随机
        return new RandomRule();
    }

}
