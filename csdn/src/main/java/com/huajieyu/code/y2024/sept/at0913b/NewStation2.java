package com.huajieyu.code.y2024.sept.at0913b;

/**
 * 售票站点
 */
public class NewStation2 extends Thread {

    /**
     * 创建一个共享变量，记录当前剩余车票的数量
     */
    public volatile static int count = 500;

    @Override
    public void run() {
        // 使用同步方法
        while(count > 0){
            sell();
        }
    }

    // 同步方法需要加上关键字在权限修饰符后面
    public static synchronized void sell() {
        if (count > 0) {
            System.out.println("序号为" + count + "的票被站点" + Thread.currentThread().getName() + "出售成功");
            count--;
        }
    }
}
