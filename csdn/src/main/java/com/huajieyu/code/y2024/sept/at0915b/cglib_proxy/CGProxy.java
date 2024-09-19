package com.huajieyu.code.y2024.sept.at0915b.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB代理
 */
public class CGProxy implements MethodInterceptor {

    public Example getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Example.class);
        enhancer.setCallback(this);
        Example example = (Example) enhancer.create();
        return example;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB代理1");
        methodProxy.invokeSuper(o, objects);
        System.out.println("CGLIB代理2");
        return null;
    }
}
