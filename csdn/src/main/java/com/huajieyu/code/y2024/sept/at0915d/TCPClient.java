package com.huajieyu.code.y2024.sept.at0915d;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) throws IOException {

        String host = "127.0.0.1";
        int port = 8888;
        InetAddress address = InetAddress.getByName(host);
        try (
                // 定义客户端的服务,连接本地的8888端口
                Socket socket = new Socket(address, port);
                OutputStream outputStream = socket.getOutputStream();
        ) {

            // 给服务端发送一句话
            outputStream.write("你好老兄！".getBytes());

            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
