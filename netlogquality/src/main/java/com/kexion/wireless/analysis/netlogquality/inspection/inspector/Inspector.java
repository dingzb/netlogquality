package com.kexion.wireless.analysis.netlogquality.inspection.inspector;

import com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean.NetLog;
import com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean.NetLogQuality;

/**
 * Created by Neo on 2016/6/23.
 * 上网日志检测器
 */
public interface Inspector {

    /**
     * 检测是否合格
     *
     * @param netLog
     * @param netLogQuality
     * @return
     */
    void inspect(NetLog netLog, NetLogQuality netLogQuality);
}
