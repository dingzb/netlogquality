package com.kexion.wireless.analysis.netlogquality.mongo.bean;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by Neo on 2016/6/23.
 */
@Document(collection = "WA_SOURCE_FJ_0002")
public class ProtocalDataEntity {
    private String placeCode;

    @Field("PLACE_CODE")
    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }
}
