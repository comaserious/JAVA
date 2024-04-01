package com.ohgiraffers.section02.tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        int port = 8500;

        // 서버의 주소를 입력(client)
        String serverIP = "192.168.0.35";

        Socket socket = new Socket(serverIP,port);

        if(socket!=null){
            InputStream input = socket.getInputStream();
            OutputStream output=socket.getOutputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            PrintWriter pw = new PrintWriter(output);

            Scanner scr = new Scanner(System.in);
            do {
                System.out.println("메세지 입력  : ");
                String message = scr.nextLine();

                pw.println(message);
                pw.flush();

                if(message.equals("exit")){
                    break;
                }

                String recieveMesaage  = br.readLine();
                System.out.println(recieveMesaage);
            }while(true);

            br.close();
            pw.close();
            socket.close();
        }
    }
}
