package com.huajieyu.code.y2024.sept.at0913a;

public class RunnableTest {

    public static void main(String[] args) {
        // 创建Runnable的实现对象
        Example2 example1 = new Example2();

        // 把example1和某个线程绑定，这边虽然3个线程都绑定了example1，但实际上是会创建3个不同的线程。可以在控制台的输出中确认
        Thread thread1 = new Thread(example1);
        Thread thread2 = new Thread(example1);
        Thread thread3 = new Thread(example1);

        // 开启线程执行
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
