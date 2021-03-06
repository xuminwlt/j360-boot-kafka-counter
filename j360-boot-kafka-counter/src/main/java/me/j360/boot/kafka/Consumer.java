/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.j360.boot.kafka;

import me.j360.boot.kafka.manager.CounterManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
class Consumer {

	//@KafkaListener(topics = "testTopic")
//	//public void processMessage(SampleMessage message) {
//		System.out.println("Received sample message [" + message + "]");
//	}

	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
	private CounterManager counterManager;

	@KafkaListener(topics = "testTopic")
	public void processMessageString(String message) {
		System.out.println("Received string sample message [" + message + "]");

		System.out.println(mongoTemplate.getDb().getName());

	}
}
