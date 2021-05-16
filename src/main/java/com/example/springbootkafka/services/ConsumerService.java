package com.example.springbootkafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "hello", groupId = "group_id")
    public void consumeMessage(String message) {
        System.out.println(message);
    }
}
