package com.kexion.wireless.simulation;

/**
 * Created by Neo on 2016/6/25.
 *
 */
public class App {
    public static void main(String[] args) {
        ProtocalSender producer = new ProtocalSender();
        producer.send();
    }
}
