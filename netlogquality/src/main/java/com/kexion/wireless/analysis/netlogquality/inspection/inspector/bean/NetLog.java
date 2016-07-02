package com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean;

import org.bson.types.ObjectId;

import java.util.Date;

/**
 * Created by Neo on 2016/6/23.
 * 上网日志bean
 */
public class NetLog {
    private ObjectId objectId;
    private Date time;
    private String mac;
    private String account;
    private String placeCode;

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ObjectId getObjectId() {
        return objectId;
    }

    public void setObjectId(ObjectId objectId) {
        this.objectId = objectId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
