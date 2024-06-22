
package com.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka.model.CustomMessage;


@Service
public class MessageConsumer {

    @KafkaListener(topics = "my_topic", groupId = "my-group")
    public void listen(CustomMessage message) {
        System.out.println("Received Message: " + message);
    }
}
