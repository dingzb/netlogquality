package com.kexion.wireless.analysis.netlogquality.inspection.inspector;

import com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean.NetLog;
import com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean.NetLogQuality;

/**
 * Created by Neo on 2016/6/23.
 * Mac 合格检测器
 */
public abstract class MacInspector implements Inspector {

    @Override
    public void inspect(NetLog netLog, NetLogQuality netLogQuality) {
        netLogQuality.setIllegalMac(inspect(netLog.getMac()));
    }

    /**
     * 检测MAC是否合格
     *
     * @param mac
     * @return
     */
    protected abstract boolean inspect(String mac);
}
