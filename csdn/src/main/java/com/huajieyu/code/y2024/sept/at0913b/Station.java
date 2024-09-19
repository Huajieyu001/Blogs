package com.huajieyu.code.y2024.sept.at0913b;

/**
 * 售票站点
 */
public class Station extends Thread {

    /**
     * 创建一个共享变量，记录当前剩余车票的数量
     */
    public static int count = 50;

    @Override
    public void run() {
        while(count > 0){
            System.out.println("序号为" + count + "的票被站点" + Thread.currentThread().getName() + "出售成功");
            count--;
        }
    }
}
