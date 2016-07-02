package com.kexion.wireless.analysis.netlogquality.kafka;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Collections;
import java.util.Properties;

/**
 * Created by Neo on 2016/6/25.
 * 消费者
 */
public class ProtocalConsumer {
    public static void main(String[] args) {

//        Properties properties = new Properties();
//        properties.setProperty("bootstrap.servers", "master.hadoop:9092,slave1.hadoop:9092,slave2.hadoop:9092");
//        properties.setProperty("group.id", "netlogquality");

        Properties props = new Properties();
        props.put("bootstrap.servers", "master.hadoop:9092,slave1.hadoop:9092,slave2.hadoop:9092");
        props.put("group.id", "netlogquality");
//        props.put("enable.auto.commit", "true");
//        props.put("auto.commit.interval.ms", "1000");
//        props.put("session.timeout.ms", "30000");
//        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);

        Consumer<String, String> consumer =
                new KafkaConsumer<>(props, new StringDeserializer(), new StringDeserializer());
        consumer.subscribe(Collections.singletonList("protocal"));
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord<String, String> record : records) {
                System.out.println("offset:" + record.offset() + " value:" + record.value());
            }
        }
    }
}
