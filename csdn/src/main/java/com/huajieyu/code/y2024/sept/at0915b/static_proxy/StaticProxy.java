package com.huajieyu.code.y2024.sept.at0915b.static_proxy;

/**
 * 静态代理类
 */
public class StaticProxy {

    private final Example example = new Example();

    public StaticProxy() {
    }

    public void run(){
        System.out.println("静态代理1");
        example.run();
        System.out.println("静态代理2");
    }
}
