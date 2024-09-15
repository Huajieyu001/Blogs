package com.huajieyu.code.y2024.sept.at0915b.jdk_proxy;

import com.huajieyu.code.y2024.sept.at0915b.cglib_proxy.Example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 */
public class JDKProxy {

    private Example example = new Example();

    public AbstractExample getProxy(){
        AbstractExample proxyInstance = (AbstractExample) Proxy.newProxyInstance(example.getClass().getClassLoader(), example.getClass().getInterfaces(), (proxy, method, args) -> {

            System.out.println("JDK动态代理1");
            Object object = method.invoke(example, args);
            System.out.println("JDK动态代理2");

            // 本方法需要有返回值，由于void是不需要返回值的所以object其实是null
            return object;
        });

        return proxyInstance;
    }

    public AbstractExample getProxy5(){
        AbstractExample proxyInstance = (AbstractExample) Proxy.newProxyInstance(example.getClass().getClassLoader(), example.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("JDK动态代理1");
                Object object = method.invoke(example, args);
                System.out.println("JDK动态代理2");

                // 本方法需要有返回值，由于void是不需要返回值的所以object其实是null
                return object;
            }
        });

        return proxyInstance;
    }
}
