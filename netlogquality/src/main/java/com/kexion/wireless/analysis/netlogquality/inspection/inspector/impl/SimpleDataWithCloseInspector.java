package com.kexion.wireless.analysis.netlogquality.inspection.inspector.impl;

import com.kexion.wireless.analysis.netlogquality.inspection.inspector.DataWithCloseInspector;

import java.util.Date;

/**
 * Created by Neo on 2016/6/23.
 */
public class SimpleDataWithCloseInspector extends DataWithCloseInspector{
    @Override
    protected boolean inspect(String placeCode, Date time) {
        return false;
    }
}
