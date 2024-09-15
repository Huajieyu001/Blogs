package com.huajieyu.code.y2024.sept.at0915c;

public class ExampleATest {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        ExampleA example = () -> {
            System.out.println("无参无返回");
        };

        // 调用run方法
        example.run();
    }
}