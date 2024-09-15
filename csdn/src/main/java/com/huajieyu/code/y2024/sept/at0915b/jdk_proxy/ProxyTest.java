package com.huajieyu.code.y2024.sept.at0915b.jdk_proxy;

public class ProxyTest {

    public static void main(String[] args) {
        // 创建代理类
        JDKProxy jdkProxy = new JDKProxy();

        // 获取代理对象
        AbstractExample proxy = jdkProxy.getProxy();
        // 调用run方法
        proxy.run();
    }
}
