package com.zpb.rocketmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2022/4/7 15:16
 * @updateDate   2022/4/7 15:16
 * @version      1.0
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "springboot-rocketmq",consumerGroup = "${rocketmq.consumer.group}")
public class RocketmqConsumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        log.info("receive message: {}",s);
    }
}
