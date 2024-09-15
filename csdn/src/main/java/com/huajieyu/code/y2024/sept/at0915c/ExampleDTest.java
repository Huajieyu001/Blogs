package com.huajieyu.code.y2024.sept.at0915c;

public class ExampleDTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        ExampleD example = () -> 1024;

        // 调用run方法
        System.out.println(example.run());
    }
}