package com.huajieyu.code.y2024.sept.at0915d;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) {
        try (
                // 创建服务端对象，用于接收客户端的请求，并把服务端口设置为8888
                ServerSocket serverSocket = new ServerSocket(8888);
        ) {
            // 调用accept等待被连接
            while(true){
                Socket accept = serverSocket.accept();
                InputStream is = accept.getInputStream();

                BufferedReader br = new BufferedReader(new InputStreamReader(is));

                String string = br.readLine();
                System.out.println("From client:" + string);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
