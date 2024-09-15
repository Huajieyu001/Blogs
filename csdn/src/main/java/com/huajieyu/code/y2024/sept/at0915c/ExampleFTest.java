package com.huajieyu.code.y2024.sept.at0915c;

public class ExampleFTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        ExampleF example = (n1, n2) -> n1 + n2;

        // 调用run方法
        System.out.println(example.run(1000, 24));
    }
}