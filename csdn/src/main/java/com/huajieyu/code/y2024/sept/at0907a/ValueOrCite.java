package com.huajieyu.code.y2024.sept.at0907a;

import java.util.Arrays;

public class ValueOrCite {

    public static void main2(String[] args) {
        int num = 10;
        String name = "Tom";
        int modifiedNum = modifyAndReturn(num);
        String modifiedName = modifyAndReturn(name);
        System.out.println("打印num：" + num);
        System.out.println("打印name：" + name);
        System.out.println("------------------------------------");
        System.out.println("打印modifiedNum：" + modifiedNum);
        System.out.println("打印modifiedName：" + modifiedName);
    }

    public static void main3(String[] args) {
        int num = 10;
        String name = "Tom";
        // 打印num和str的地址
        System.out.println("修改前，传参前：");
        System.out.println(System.identityHashCode(num));
        System.out.println(System.identityHashCode(name));

        System.out.println("---------------------------");
        printAddr(num, name);

        System.out.println("---------------------------");
        System.out.println("修改后，执行完方法后：");
        System.out.println(System.identityHashCode(num));
        System.out.println(System.identityHashCode(name));
    }

    public static void main4(String[] args) {
        Person person = new Person("Rosy", 24);
        String [] strings = {"AAA", "BBB", "CCC"};
        System.out.println("第1次打印：");
        System.out.println(person);
        System.out.println(Arrays.toString(strings));

        modifyObjAndPrintValue(person, strings);

        System.out.println("---------------------------");
        System.out.println("第4次打印：");
        System.out.println(person);
        System.out.println(Arrays.toString(strings));
    }


    public static void modifyObjAndPrintValue(Person person, String [] strings){
        System.out.println("---------------------------");
        System.out.println("第2次打印：");
        System.out.println(person);
        System.out.println(Arrays.toString(strings));

        person.setAge(1024);
        person.setName("ABC");
        strings[0] = "XXX";

        System.out.println("---------------------------");
        System.out.println("第3次打印：");
        System.out.println(person);
        System.out.println(Arrays.toString(strings));
    }

    public static void main(String[] args) {
        Person person = new Person("Rosy", 24);
        String [] strings = {"AAA", "BBB", "CCC"};
        System.out.println("第1次打印：");
        System.out.println(System.identityHashCode(person));
        System.out.println(System.identityHashCode(person.getAge()));
        System.out.println(System.identityHashCode(person.getName()));
        System.out.println(System.identityHashCode(strings));
        System.out.println(System.identityHashCode(strings[0]));

        modifyObjAndPrintAddr(person, strings);

        System.out.println("---------------------------");
        System.out.println("第4次打印：");
        System.out.println(System.identityHashCode(person));
        System.out.println(System.identityHashCode(person.getAge()));
        System.out.println(System.identityHashCode(person.getName()));
        System.out.println(System.identityHashCode(strings));
        System.out.println(System.identityHashCode(strings[0]));
    }


    public static void modifyObjAndPrintAddr(Person person, String [] strings){
        System.out.println("---------------------------");
        System.out.println("第2次打印：");
        System.out.println(System.identityHashCode(person));
        System.out.println(System.identityHashCode(person.getAge()));
        System.out.println(System.identityHashCode(person.getName()));
        System.out.println(System.identityHashCode(strings));
        System.out.println(System.identityHashCode(strings[0]));

        person.setAge(1024);
        person.setName("ABC");
        strings[0] = "XXX";

        System.out.println("---------------------------");
        System.out.println("第3次打印：");
        System.out.println(System.identityHashCode(person));
        System.out.println(System.identityHashCode(person.getAge()));
        System.out.println(System.identityHashCode(person.getName()));
        System.out.println(System.identityHashCode(strings));
        System.out.println(System.identityHashCode(strings[0]));
    }

    public static void printAddr(int n, String str){
        // 打印n和str的地址
        System.out.println("修改前，传参后：");
        System.out.println(System.identityHashCode(n));
        System.out.println(System.identityHashCode(str));

        n = 999;
        str = "ABC";

        // 打印n和str的地址
        System.out.println("---------------------------");
        System.out.println("修改后，传参后：");
        System.out.println(System.identityHashCode(n));
        System.out.println(System.identityHashCode(str));
    }

    public static void modify(int n, String str){
        System.out.println("第1次打印int：" + n);
        System.out.println("第1次打印String：" + str);
        System.out.println("------------------------------------");

        // 尝试在方法内部修改传进来的参数
        n = 999;
        str = "ABC";
        System.out.println("第2次打印int：" + n);
        System.out.println("第2次打印String：" + str);
        System.out.println("------------------------------------");
    }

    public static int modifyAndReturn(int n){
        System.out.println("modifyAndReturn第1次打印int：" + n);

        // 尝试在方法内部修改传进来的参数
        n = 999;
        System.out.println("modifyAndReturn第2次打印int：" + n);
        System.out.println("------------------------------------");
        return n;
    }

    public static String modifyAndReturn(String str){
        System.out.println("modifyAndReturn第1次打印String：" + str);

        // 尝试在方法内部修改传进来的参数
        str = "ABC";
        System.out.println("modifyAndReturn第2次打印String：" + str);
        System.out.println("------------------------------------");
        return str;
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
