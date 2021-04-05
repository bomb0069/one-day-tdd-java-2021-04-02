package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BombSenderTest {

    @Test
    public void call_sender_must_send_mail_to_call () {
        BombSender bombSender = new BombSender();
        SenderSpy spy = new SenderSpy();

        bombSender.setSender(spy);

        bombSender.send("bomb@gmail.com");

        assertEquals(1, spy.count);
        assertEquals("bomb@gmail.com", spy.email);

    }
}

class SenderSpy extends Sender {
    int count = 0;
    String email = "";

    @Override
    public void send(String email) {
        count++;
        this.email = email;
    }
}