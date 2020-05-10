package com.atguigu.springcloud.service;

import cn.hutool.core.lang.UUID;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.binding.MessageChannelAndSourceConfigurer;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @author renyuyu
 * @Description:
 * @date 2020-05-10 7:35 下午
 */
@EnableBinding(Source.class)
public class IMessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: "+serial);
        return null;
    }

}
