package com.huajieyu.code.y2024.sept.at0915c;

public class ExampleETest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        ExampleE example = e -> e * 2;

        // 调用run方法
        System.out.println(example.run(24));
    }
}