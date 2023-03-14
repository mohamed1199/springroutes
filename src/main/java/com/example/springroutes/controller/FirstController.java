package com.example.springroutes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

@RestController
public class FirstController {

    @Autowired
    Environment environment ;

    @GetMapping("/")
    public String getDefault(){
        return "Default from " + getAddress() ;
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello from " +  getAddress() ;
    }

    @GetMapping("/bonjour")
    public String getBnj(){
        return "Bonjour from " +  getAddress() ;
    }

    public String getAddress(){
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("google.com", 80));
            return socket.getLocalAddress().getHostAddress();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
