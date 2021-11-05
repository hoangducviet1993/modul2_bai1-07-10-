package com.codegym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


interface SocketInterface {
    String readLine();

    void writeLine(String str);

    void dispose();
}

class SocketProxy implements SocketInterface {
    // 1. Tạo một “wrapper” cho mục tiêu từ xa,
    // hoặc xa xỉ, hoặc nhạy cảm
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public SocketProxy(String host, int port, boolean wait) {
        try {
            if (wait) {
                // 2. Đóng gói sự phức tạp/ chi phí của mục tiêu trong wrapper
                ServerSocket server = new ServerSocket(port);
                socket = server.accept();
            } else {
                socket = new Socket(host, port);
            }
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readLine() {
        String str = null;
        try {
            str = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public void writeLine(String str) {
        // 4. Ủy quyền tới muc tiêu
        out.println(str);
    }

    public void dispose() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        // 3. Client xử lý, giao tiếp với wrapper
        SocketInterface socket = new SocketProxy("127.0.0.1", 8080, args[0].equals("first") ? true : false);
        String str;
        boolean skip = true;
        while (true) {
            if (args[0].equals("second") && skip) {
                skip = !skip;
            } else {
                str = socket.readLine();
                System.out.println("Receive - " + str);
                if (str.equals(null)) {
                    break;
                }
            }
            System.out.print("Send ---- ");
            str = new Scanner(System.in).nextLine();
            socket.writeLine(str);
            if (str.equals("quit")) {
                break;
            }
        }
        socket.dispose();
    }
}
