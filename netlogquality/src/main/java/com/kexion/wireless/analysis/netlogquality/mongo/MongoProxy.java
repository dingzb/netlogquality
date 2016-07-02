package com.kexion.wireless.analysis.netlogquality.mongo;

import com.mongodb.MongoClient;
import com.sun.xml.internal.txw2.output.IndentingXMLFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Neo on 2016/6/24.
 * no support username,password
 */
public class MongoProxy {

    private static final Logger logger = LoggerFactory.getLogger(MongoProxy.class);

    private static String host;
    private static Integer port;
    private static String database;

    public static String getDatabase() {
        return database;
    }

    //    private String username;
//    private String password;

    private static MongoClient client;

    public static MongoClient getClient() {
        synchronized (client) {
            if (client != null) {
                client = new MongoClient(host, port);
            }
            return client;
        }
    }

    static {
        Properties prop = new Properties();
        try {
            prop.load(MongoProxy.class.getResourceAsStream("mongo.properties"));
            host = prop.getProperty("host", "127.0.0.1");
            port = Integer.parseInt(prop.getProperty("port", "27017"));
            database = prop.getProperty("database");
        } catch (IOException e) {
            logger.error(e.getMessage());
            System.exit(-1);
        }
        if (host == null || port == null || database == null) {
            logger.error("mongo config error [host:{},port:{},database:{}]", host, port, database);
            System.exit(-1);
        }
    }
}
