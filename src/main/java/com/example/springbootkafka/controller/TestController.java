package com.example.springbootkafka.controller;

import com.example.springbootkafka.services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private ProducerService producer;

    @PostMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message) {
        producer.sendMessage(message);
    }
}
