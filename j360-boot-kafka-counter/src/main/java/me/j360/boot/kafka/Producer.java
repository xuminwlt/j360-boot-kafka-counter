package me.j360.boot.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	private final KafkaTemplate<Object, String> kafkaTemplate;

	Producer(KafkaTemplate<Object, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

//	public void send(SampleMessage message) {
//		this.kafkaTemplate.send("testTopic", message);
//		System.out.println("Sent sample message [" + message + "]");
//	}

	public void send(SampleMessage message) {
		this.kafkaTemplate.send("testTopic", message.toString());
		System.out.println("Sent sample message [" + message + "]");
	}
}
