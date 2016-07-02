package com.kexion.wireless.analysis.netlogquality.inspection.inspector;

import com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean.NetLog;
import com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean.NetLogQuality;

/**
 * Created by Neo on 2016/6/23.
 */
public abstract class DataWithoutPlace implements Inspector {
    @Override
    public void inspect(NetLog netLog, NetLogQuality netLogQuality) {

    }

    protected abstract boolean inspect(String placeCode);
}
