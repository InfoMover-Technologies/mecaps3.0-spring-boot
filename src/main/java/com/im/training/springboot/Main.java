package com.im.training.springboot;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Main {


    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(7001);

        System.out.println("Server started");

        while (true) {
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[2024];

            int len = inputStream.read(buffer);
            String requestData = new String(buffer, 0, len);

            socket.getOutputStream().write("<html><body><h1>MeCaps</h1></body></html>".getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
            socket.close();

            System.out.println(requestData);
        }


    }

}
