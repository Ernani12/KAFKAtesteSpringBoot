
package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
		//curl -X POST "http://localhost:8080/send?id=1&content=Hello%20Kafka"
		//enviar para linha comando terminal uma menssagem

	}

}
