package com.wxy.kafka;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author wxy
 * @Date 19-7-8 上午11:32
 * @Description TODO
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class KafkaProducerTest {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Test
    public void TestSend() {
        for (int i = 0; i < 100; i++) {
            kafkaTemplate.send("test", "hello world");
            log.info("发送数据");
        }
    }

    @Test
    public void TestSend1() {
        for (int i = 0; i < 100; i++) {
            kafkaTemplate.send("test1", "hello world");
            log.info("发送数据");
        }
    }

}
