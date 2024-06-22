package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.kafka.model.CustomMessage;
import com.example.kafka.service.MessageProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class KafkaController {

    @Autowired
    private MessageProducer producer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam("id") String id, @RequestParam("content") String content) {
        CustomMessage message = new CustomMessage(id, content);
        producer.sendMessage(message);
        return "Message sent to Kafka topic!";
    }
}