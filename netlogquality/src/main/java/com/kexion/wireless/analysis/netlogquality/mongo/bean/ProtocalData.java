package com.kexion.wireless.analysis.netlogquality.mongo.bean;

/**
 * Created by Neo on 2016/6/23.
 * 协议数据（上网日志）
 *
 * @author Neo
 */
public class ProtocalData {
    public static final String COLLECTION_NAME = "WA_SOURCE_FJ_0002";// collecitonname
    public static final String CMDKEY = "cmdkey";// 命令码
    public static final String USERNAME = "USER_NAME";// 用户账号
    public static final String SESSIONID = "SESSIONID";// 会话ID
    public static final String NETSERVERPORT_WACODE = "NETSERVERPORT_WACODE";// 上网服务场所编码
    // public static final String NETWORK_APP = "network_app";// 网络应用服务类型
    public static final String NETWORK_APP = "NETWORK_APP";// 网络应用服务类型
    //	public static final String IP_ADDRESS = "ip_address";// 场所内网IP地址
    public static final String IP_ADDRESS = "IP_ADDRESS";// 场所内网IP地址
    public static final String PORT = "PORT";// 场所内网端口号
    public static final String SRC_IP = "SRC_IP";// 源外网IPv4地址
    public static final String SRC_IPV6 = "SRC_IPV6";// 源外网IPv6地址
    public static final String SRC_PORT_START = "SRC_PORT_START";// 源外网IPv4起始端口号
    public static final String SRC_PORT_END = "SRC_PORT_END";// 源外网IPv4结束端口号
    public static final String SRC_PORT_START_V6 = "SRC_PORT_START_V6";// 源外网IPv6起始端口号
    public static final String SRC_PORT_END_V6 = "SRC_PORT_END_V6";// 源外网IPv6结束端口号
    public static final String DST_IP = "DST_IP";// 目的公网IPv4地址
    public static final String DST_IPV6 = "DST_IPV6";// 目的公网IPv6地址
    public static final String DST_PORT = "DST_PORT";// 目的公网IPv4端口号
    public static final String DST_PORT_V6 = "DST_PORT_V6";// 目的公网IPv6端口号
    public static final String MAC = "MAC";// 终端MAC地址
    public static final String COLLECTION_EQUIPMENT_ID = "COLLECTION_EQUIPMENT_ID";// AP设备编号
    public static final String AP_MAC = "AP_MAC";// AP设备MAC地址
    public static final String LONGITUDE = "LONGITUDE";// 移动AP经度
    public static final String LATITUDE = "LATITUDE";// 移动AP纬度
    public static final String CAPTURE_TIME = "CAPTURE_TIME";// 日志记录时间
    // public static final String CAPTURE_TIME = "capturetime";// 日志记录时间
    public static final String RESERVE = "RESERVE";// 保留
}

