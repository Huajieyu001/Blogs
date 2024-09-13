package com.huajieyu.code.y2024.sept.at0913a;

public class ThreadTest {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        Example1 example2 = new Example1();
        Example1 example3 = new Example1();
        // 调用start方法，它是启动线程的方法，会帮助我们调用run方法
        example1.start();
        example2.start();
        example3.start();
    }

    public static void main1(String[] args) {
        Example1 example1 = new Example1();
        Example1 example2 = new Example1();
        Example1 example3 = new Example1();
        // 调用start方法，它是启动线程的方法，会帮助我们调用run方法
        example1.start();
        example2.start();
        example3.start();
    }
}
