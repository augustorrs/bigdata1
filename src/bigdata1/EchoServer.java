/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdata1;

import java.io.BufferedReader;
import static java.io.FileDescriptor.in;
import static java.io.FileDescriptor.out;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;

/**
 *
 * @author Augusto Souza
 */
public class EchoServer {
 public void start(int port) throws IOException {
 serverSocket = new ServerSocket();
 clientSocket = serverSocket.accept();
 out = new PrintWriter(clientSocket.getOutputStream(), true);
 in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

 String inputLine;
 while ((inputLine = in.readLine()) != null) {
     if (".".equals(inputLine)) {
 out.println("good bye");
 break;
 }
 out.println(inputLine);
 }
} 
 }
