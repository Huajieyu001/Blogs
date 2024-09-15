package com.huajieyu.code.y2024.sept.at0914a;

import java.io.*;

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pet pet = new Pet("Dog mi", 2);
        Person person = new Person("Rosy", 24, pet);

        // 打印对象的地址
        System.out.println(System.identityHashCode(person));
        System.out.println(System.identityHashCode(person.getPet()));
        System.out.println(person);
        System.out.println("----------------------------------");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("at0914a.txt")));){
            // 把person对象写入at0914.txt文件里
            oos.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Person clonePerson = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("at0914a.txt")));){
            // 把写入at0914.txt文件里的文本给反序列化成Person类型的对象
            clonePerson = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 打印对象的地址，判断和原来的对象是否是同一个
        System.out.println(System.identityHashCode(clonePerson));
        System.out.println(System.identityHashCode(clonePerson.getPet()));
        System.out.println(clonePerson);

        System.out.println("***********************************");
        // 下面尝试把克隆出来的对象的宠物修改名字为Cat uu
        clonePerson.getPet().setName("Cat uu");

        // 打印源对象和克隆后的对象查看效果
        System.out.println(person);
        System.out.println(clonePerson);
    }

    public static void main1(String[] args) throws CloneNotSupportedException {
        Pet pet = new Pet("Dog mi", 2);
        Person person = new Person("Rosy", 24, pet);

        // 打印对象的地址
        System.out.println(System.identityHashCode(person));
        System.out.println(System.identityHashCode(person.getPet()));
        System.out.println(person);
        System.out.println("----------------------------------");

        Person clonePerson = person.clone();
        // 打印对象的地址，判断和原来的对象是否是同一个
        System.out.println(System.identityHashCode(clonePerson));
        System.out.println(System.identityHashCode(clonePerson.getPet()));
        System.out.println(clonePerson);

        System.out.println("***********************************");
        // 下面演示浅克隆出现的问题：此时想把克隆出来的对象的宠物修改名字为Cat uu
        clonePerson.getPet().setName("Cat uu");

        // 打印源对象和克隆后的对象查看效果
        System.out.println(person);
        System.out.println(clonePerson);
    }
}
