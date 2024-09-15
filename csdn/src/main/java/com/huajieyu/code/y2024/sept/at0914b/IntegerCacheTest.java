package com.huajieyu.code.y2024.sept.at0914b;

public class IntegerCacheTest {

    public static void main(String[] args) {
        fun1();
        fun2();
        fun3();
        fun4();
    }

    public static void fun1(){
        Integer num1 = -129;
        Integer num2 = -129;
        System.out.println(num1 == num2);
    }

    public static void fun2(){
        Integer num1 = -128;
        Integer num2 = -128;
        System.out.println(num1 == num2);
    }

    public static void fun3(){
        Integer num1 = 127;
        Integer num2 = 127;
        System.out.println(num1 == num2);
    }

    public static void fun4(){
        Integer num1 = 128;
        Integer num2 = 128;
        System.out.println(num1 == num2);
    }
}
