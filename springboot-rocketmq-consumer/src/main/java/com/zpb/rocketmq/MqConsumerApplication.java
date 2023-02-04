package com.zpb.rocketmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author       pengbo.zhao
 * @description  消费者-服务
 * @createDate   2022/4/7 15:18
 * @updateDate   2022/4/7 15:18
 * @version      1.0
 */
@SpringBootApplication
public class MqConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MqConsumerApplication.class,args);
    }
}
