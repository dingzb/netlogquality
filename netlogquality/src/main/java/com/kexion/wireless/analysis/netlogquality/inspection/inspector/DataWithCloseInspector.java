package com.kexion.wireless.analysis.netlogquality.inspection.inspector;

import com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean.NetLog;
import com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean.NetLogQuality;

import java.util.Date;

/**
 * Created by Neo on 2016/6/23.
 * 停业有数据判断
 */
public abstract class DataWithCloseInspector implements Inspector {
    @Override
    public void inspect(NetLog netLog, NetLogQuality netLogQuality) {
        netLogQuality.setDataWithClose(inspect(netLog.getPlaceCode(), netLog.getTime()));
    }

    /**
     * 根据场所编码和数据时间判断是否为停业有数据
     *
     * @param placeCode
     * @param time
     * @return true:停业无数据,false:停业有数据
     */
    protected abstract boolean inspect(String placeCode, Date time);
}
