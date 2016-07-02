package com.kexion.wireless.analysis.netlogquality.inspection;

import com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean.NetLog;
import com.kexion.wireless.analysis.netlogquality.inspection.inspector.bean.NetLogQuality;
import com.kexion.wireless.analysis.netlogquality.inspection.inspector.Inspector;
import com.kexion.wireless.analysis.netlogquality.inspection.inspector.impl.MacFormatInspector;
import com.kexion.wireless.analysis.netlogquality.inspection.inspector.impl.SimpleDataWithCloseInspector;
import com.kexion.wireless.analysis.netlogquality.inspection.inspector.impl.SimpleDataWithoutPlace;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Neo on 2016/6/23.
 * 质量检测
 */
public class Inspection {

    private List<Inspector> inspectors = new ArrayList<Inspector>();

    /**
     * 默认加载所有检查器
     */
    public Inspection() {
        inspectors.add(new MacFormatInspector());
        inspectors.add(new SimpleDataWithoutPlace());
        inspectors.add(new SimpleDataWithCloseInspector());
    }

    public Inspection(List<Inspector> inspectors) {

        List<String> inspectorClass = new ArrayList<String>();
        for (Inspector inspector : inspectors) {
            String className = inspector.getClass().getName();
            if (inspectorClass.contains(className)) {
                throw new IllegalArgumentException("The inspector [" + className + "] has multiple add.");
            } else {
                inspectorClass.add(inspector.getClass().getName());
            }
        }

        this.inspectors = inspectors;
    }


    /**
     * 判断上网日志数据中各个指标是否合格
     *
     * @param netLog
     * @return
     */
    public NetLogQuality inspect(NetLog netLog) {
        NetLogQuality netLogQuality = new NetLogQuality();
        for (Inspector inspector : inspectors) {
            inspector.inspect(netLog, netLogQuality);
        }
        return netLogQuality;
    }

    /**
     * 判断上网日志数据中各个指标是否合格
     *
     * @param netLogs
     * @return
     */
    public List<NetLogQuality> inspect(List<NetLog> netLogs) {
        List<NetLogQuality> netLogQualities = new ArrayList<NetLogQuality>();
        for (NetLog netLog : netLogs) {
            netLogQualities.add(inspect(netLog));
        }
        return netLogQualities;
    }

}
