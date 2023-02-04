import com.zpb.rocketmq.producer.MqProducerApplication;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;

/**
 * @author       pengbo.zhao
 * @description  生产者
 * @createDate   2022/4/7 14:56
 * @updateDate   2022/4/7 14:56
 * @version      1.0
 */
@DisplayName("生产者")
@SpringBootTest(classes = MqProducerApplication.class)
class ProducerTest {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @Test
    void sendMessage(){
        byte[] body = "hello springboot rocketmq".getBytes(StandardCharsets.UTF_8);
        rocketMQTemplate.convertAndSend("springboot-rocketmq","hello springboot rocketmq");
        Assertions.assertTrue(true);
    }

}
