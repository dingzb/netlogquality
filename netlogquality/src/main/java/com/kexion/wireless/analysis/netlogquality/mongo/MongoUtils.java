package com.kexion.wireless.analysis.netlogquality.mongo;


import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by Neo on 2016/6/23.
 * mongo连接
 */
public class MongoUtils {

    private MongoOperations mongoOperations = new MongoTemplate(MongoProxy.getClient(), MongoProxy.getDatabase());

    public MongoOperations getMongoOperations() {
        return mongoOperations;
    }
}
