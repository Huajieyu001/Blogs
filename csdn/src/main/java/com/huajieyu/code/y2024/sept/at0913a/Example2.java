package com.huajieyu.code.y2024.sept.at0913a;

/**
 * 实现Runnable
 */
public class Example2 implements Runnable{

    /**
     * 重写run方法，把自己需要处理的语句写在方法内部
     */
    @Override
    public void run() {
        int i = 1;
        // 为了更直观体现出多线程的状态，多次打印log输出到控制台
        while(i <= 50){
            System.out.println("Runnable:线程" + Thread.currentThread().getName() + "正在执行第" + i + "次输出");
            i++;
            try {
                // 避免因为输出太快看不到变化，可以加上sleep时间动态观察控制台
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
