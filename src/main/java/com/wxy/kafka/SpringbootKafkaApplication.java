package com.wxy.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class SpringbootKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaApplication.class, args);
    }

    /**
     * 监听 test topic
     *
     * @param record
     */
    @KafkaListener(topics = {"test"})
    public void listen(ConsumerRecord<?, ?> record) {
        log.info("消费数据：record = {}", record);
    }

    @KafkaListener(topics = {"test1"})
    public void listen1(ConsumerRecord<?, ?> record) {
        log.info("消费数据：record = {}", record);
    }
}
