package com.huajieyu.code.y2024.sept.at0913a;

public class Example4 extends Thread{

    @Override
    public void run() {
        int i = 1;
        while(i <= 5){
            System.out.println("线程" + Thread.currentThread().getName() + "正在执行第" + i + "次输出");
            i++;
        }
    }
}
