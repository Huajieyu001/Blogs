package com.huajieyu.code.y2024.sept.at0915d;

import java.net.*;

public class UDPServer {

    public static void main(String[] args) {
        try (
                // 创建服务端对象，用于接收客户端的请求，并把服务端口设置为9999
                DatagramSocket socket = new DatagramSocket(9999);
        ) {
            // 为了演示，这里加个while循环重复发送消息
            while (true) {
                String str = "Hello UDP client";
                // 指定数据和发送的目标位置
                DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"), 9888);
                socket.send(dp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}