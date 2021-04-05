package com.example.demo;

public class BombSender {
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    Sender sender = new Sender();


    public void send(String email) {
        sender.send(email);
    }
}
