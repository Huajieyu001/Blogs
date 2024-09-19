package com.huajieyu.code.y2024.sept.at0910a;

import java.io.*;

public class Example {

    /**
     * @param object 需要序列化的对象
     * @param path   存储序列化文件的路径
     */
    public static void toStream(Object object, String path) {
        // 创建一个File对象，用于后面的序列化
        File file = new File("example.txt");

        //输出一下查看对象
        System.out.println(object);
        try (
                // 创建对象输出流，用于把对象写为文件
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {

            oos.writeObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 反序列化
     *
     * @param path 需要读取字节流的文件路径
     * @return 目标对象
     */
    public static Object toObject(String path) {
        // 创建一个File对象，用于后面的反序列化
        File file = new File(path);
        Object object = null;
        try (
                // 创建对象输入流，用于读取文件
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            // 使用readObject方法获取反序列化的对象
            object = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return object;
    }

    public static void main(String[] args) {
        // 执行反序列化
        Object object = toObject("example.txt");
        // 输出查看结果
        System.out.println(object);
    }
}