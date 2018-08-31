package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;




@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class KafkaPocApplicationTests {

  private static final String HELLOWORLD_TOPIC = "helloworld.t";

//  @ClassRule
//  public static KafkaEmbedded embeddedKafka =
//      new KafkaEmbedded(1, true, HELLOWORLD_TOPIC);

//  @Autowired
//  private Reciver receiver;
//
//  @Autowired
//  private Sender sender;
//
//  @Test
//  public void testReceive() throws Exception {
//    sender.send(HELLOWORLD_TOPIC, "Hello Spring Kafka!");
//
//    receiver.getCountDownLatch().await(10000, TimeUnit.MILLISECONDS);
//    assertThat(receiver.getCountDownLatch().getCount()).isEqualTo(0);
//  }
}