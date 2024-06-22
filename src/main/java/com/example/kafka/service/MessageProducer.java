
package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.kafka.model.CustomMessage;

@Service
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, CustomMessage> kafkaTemplate;

    private static final String TOPIC = "my_topic";

    public void sendMessage(CustomMessage message) {
        kafkaTemplate.send(TOPIC, message);
    }
}