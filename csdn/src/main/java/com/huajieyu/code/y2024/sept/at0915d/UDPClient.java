package com.huajieyu.code.y2024.sept.at0915d;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {

    public static void main(String[] args) {
        try (
                // 创建接收端对象，用于接收发送端的数据，把服务端口设置为9888
                DatagramSocket socket = new DatagramSocket (9888);
        ) {
            byte [] bytes = new byte[24];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            socket.receive(dp);

            byte[] data = dp.getData();
            String str = new String(data);
            System.out.println("接收到消息：" + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}