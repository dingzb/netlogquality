package com.kexion.wireless.simulation;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.Future;

/**
 * Hello world!
 */
public class Producer {

    private Properties kafkaProp = new Properties();
    protected Properties simulatorProp = new Properties();

    protected Producer() {
        try {
            kafkaProp.load(Producer.class.getClassLoader().getResourceAsStream("kafka.properties"));
            simulatorProp.load(Producer.class.getClassLoader().getResourceAsStream("simulation.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected Future send(String topic, String value) {
        KafkaProducer<String, String> producer =
                new KafkaProducer<String, String>(kafkaProp, new StringSerializer(), new StringSerializer());
        ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic, value);
        return producer.send(record);
    }
}
