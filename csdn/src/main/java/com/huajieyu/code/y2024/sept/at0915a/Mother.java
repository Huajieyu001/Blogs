package com.huajieyu.code.y2024.sept.at0915a;

public class Mother {

    private String name;
    private int age;

    public Mother(String name, int age) {
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
        return "Mother{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
