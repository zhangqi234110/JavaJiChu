package com.example.demo.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 张齐 on 2019/12/10.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 端口号
        int port = 8000;
        // 在端口上创建一个服务器套接字
        ServerSocket serverSocket = new ServerSocket(port);
        // 监听来自客户端的连接
        Socket socket = serverSocket.accept();

        DataInputStream dis = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));

        DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(socket.getOutputStream()));


            String i = dis.readUTF();
            //double length = dis.readDouble();
            System.out.println("服务器端收到的消息为：" + i);
            //double result = length * length;
            String a ="好的，我已收到！";
           // dos.writeDouble(a);
            dos.writeUTF(a);
            dos.flush();


        socket.close();
        serverSocket.close();
    }
}
