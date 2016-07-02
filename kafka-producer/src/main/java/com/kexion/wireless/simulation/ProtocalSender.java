package com.kexion.wireless.simulation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * Created by Neo on 2016/6/25.
 * protocal simulator
 */
public class ProtocalSender extends Producer implements Runnable {
    private String topic;
    private int threadNum;
    private long interval;

    public ProtocalSender() {
        threadNum = Integer.parseInt(simulatorProp.getProperty("protocal.num"));
        topic = simulatorProp.getProperty("protocal.topic");
        String intervalStr = simulatorProp.getProperty("protocal.interval");
        String interStr = intervalStr.substring(0, intervalStr.length() - 1);
        if (intervalStr.endsWith("s")) {
            interval = Integer.parseInt(interStr) * 1000;
        } else if (intervalStr.endsWith("m")) {
            interval = Long.parseLong(interStr) * 60000;
        }
    }

    public void send() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(threadNum);
        for (int i = 0; i < threadNum; i++) {
            executor.schedule(new ProtocalSender(), (long) (Math.random() * 10), TimeUnit.SECONDS);
        }
        executor.shutdown();
    }


    public void run() {
        while (true) {
            super.send(topic, simulate());
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String simulate() {
        Map<String, String> record = new HashMap<String, String>();
        record.put("id", String.valueOf(Thread.currentThread().getId()));
        record.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
        return record.toString();
    }
}
