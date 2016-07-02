package com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean;

/**
 * Created by Neo on 2016/6/23.
 * 上网日志质量bean
 * 只包含记录型判断指标
 */
public class NetLogQuality {
    private Boolean illegalMac; // MAC地址非法
    private Boolean illegalMobile; // 手机号码非法
    private Boolean dataWithClose; //停业有数据
    private Boolean dataWithoutPlace; //未备案场所数据
    private Boolean illgealId; //证件号码非法

    public Boolean getIllegalMac() {
        return illegalMac;
    }

    public void setIllegalMac(Boolean illegalMac) {
        this.illegalMac = illegalMac;
    }

    public Boolean getIllegalMobile() {
        return illegalMobile;
    }

    public void setIllegalMobile(Boolean illegalMobile) {
        this.illegalMobile = illegalMobile;
    }

    public Boolean getDataWithClose() {
        return dataWithClose;
    }

    public void setDataWithClose(Boolean dataWithClose) {
        this.dataWithClose = dataWithClose;
    }

    public Boolean getDataWithoutPlace() {
        return dataWithoutPlace;
    }

    public void setDataWithoutPlace(Boolean dataWithoutPlace) {
        this.dataWithoutPlace = dataWithoutPlace;
    }

    public Boolean getIllgealId() {
        return illgealId;
    }

    public void setIllgealId(Boolean illgealId) {
        this.illgealId = illgealId;
    }
}
