package com.example.demo.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by 张齐 on 2019/12/10.
 */
/*
* 智能古诗选择器客户端
* */
public class Client {
    public static void main(String[] args) throws IOException {
        //指定端口
        int port = 8000;
        //指定服务器ip
        String host = "localhost";

        // 创建一个套接字并将其连接到指定端口号
        Socket socket = new Socket(host, port);

        DataInputStream dis = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));

        DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(socket.getOutputStream()));

        Scanner sc = new Scanner(System.in);

        boolean flag = false;




            //double length = sc.nextDouble();
                String i="你好啊，服务器，我是客户端！";
        //dos.writeDouble(i);
           dos.writeUTF(i);
            dos.flush();

            //double area = dis.readDouble();
            String s = dis.readUTF();
            System.out.println("服务器返回的应答为:" + s);



        //记得关闭
        socket.close();
    }

}
