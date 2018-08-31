package com.Kafka.Consumer;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Reciver {
	
	public static final Logger LOGGER= LoggerFactory.getLogger(Reciver.class);
	
	
	private CountDownLatch countDownLatch = new CountDownLatch(1);


	public CountDownLatch getCountDownLatch() {
		return countDownLatch;
	}


	@KafkaListener(topics = "${kafka.topic.helloworld}")
	public void reciver(String payload){
		LOGGER.info("received payload='{}'", payload);
		countDownLatch.countDown();
	}
	
	
	

}
