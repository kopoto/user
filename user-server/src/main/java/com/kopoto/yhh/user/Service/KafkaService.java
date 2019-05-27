package com.kopoto.yhh.user.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaService {


    @Value("${user.queue.order.topic}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    @KafkaListener(topics = "${user.queue.order.topic}", groupId = "${user.queue.order.group}")
    public void listenAnswer(String msg, Acknowledgment ack) {
        try {
            log.info(msg);
        } finally {
            ack.acknowledge();
        }
    }

    /**
     * 发送一条kafka消息
     *
     */
    public void sendOrderStateChangeMsg() {
        kafkaTemplate.send(topic, "ok");
    }
}
