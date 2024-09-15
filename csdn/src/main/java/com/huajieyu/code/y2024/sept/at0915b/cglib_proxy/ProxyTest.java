package com.huajieyu.code.y2024.sept.at0915b.cglib_proxy;

import com.huajieyu.code.y2024.sept.at0915b.jdk_proxy.AbstractExample;
import com.huajieyu.code.y2024.sept.at0915b.jdk_proxy.JDKProxy;

public class ProxyTest {

    public static void main(String[] args) {
        // 创建代理类
        CGProxy cgProxy = new CGProxy();

        // 获取代理对象
        Example proxy = cgProxy.getProxy();
        // 调用run方法
        proxy.run();
    }
}
