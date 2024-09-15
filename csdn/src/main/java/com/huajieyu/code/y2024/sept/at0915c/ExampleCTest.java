package com.huajieyu.code.y2024.sept.at0915c;

public class ExampleCTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        ExampleC example = (a, b) -> System.out.println("My name is " + a + ", I'm " + b + " years old");

        // 调用run方法
        example.run("John", 18);
        example.run("Russ", 17);
    }
}