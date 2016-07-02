package com.kexion.wireless.analysis.netlogquality.inspection.inspector.impl;

import com.kexion.wireless.analysis.netlogquality.inspection.inspector.MacInspector;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Neo on 2016/6/23.
 * 检查MAC地址格式是否正确
 */
public class MacFormatInspector extends MacInspector {
    @Override
    protected boolean inspect(String mac) {
        return macFormat(mac);
    }

    /**
     * 根据mac格式判断
     *
     * @param mac
     * @return
     */
    private boolean macFormat(String mac) {
        Pattern pattern = Pattern.compile("^([0-9a-fA-F]{2})(([0-9a-fA-F]{2}){5})$");
        Matcher matcher = pattern.matcher(mac);
        return matcher.find();
    }
}
