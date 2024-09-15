package com.huajieyu.code.y2024.sept.at0915b.static_proxy;

public class ProxyTest {

    public static void main(String[] args) {
        // 创建的时候是创建代理对象,而不是代理前的对象
        StaticProxy proxy = new StaticProxy();

        proxy.run();
    }
}
