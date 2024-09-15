package com.huajieyu.code.y2024.sept.at0915c;

public class ExampleBTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        ExampleB example = System.out::println;
        // 调用run方法
        example.run("Tom");
        example.run("Rosy");
    }
}