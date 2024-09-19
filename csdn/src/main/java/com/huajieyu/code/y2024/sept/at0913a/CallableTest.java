package com.huajieyu.code.y2024.sept.at0913a;

import java.util.concurrent.FutureTask;

public class CallableTest {

    public static void main(String[] args) {
        Example3 example3 = new Example3();

        FutureTask future1 = new FutureTask(example3);
        FutureTask future2 = new FutureTask(example3);
        FutureTask future3 = new FutureTask(example3);

        // 需要注意的是，绑定的FutureTask对象不能像Runnable那样绑定同一个了，要不然只会执行一个线程
        Thread thread1 = new Thread(future1);
        Thread thread2 = new Thread(future2);
        Thread thread3 = new Thread(future3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
