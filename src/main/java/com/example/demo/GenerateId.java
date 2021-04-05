package com.example.demo;

import java.util.Random;

public class GenerateId {

    public void setRandom(Random random) {
        this.random = random;
    }

    Random random = new Random();

    public String generate() {
        String randomString = String.valueOf(random.nextInt(999));
        if (randomString.length() == 1 )
            randomString = "00" + randomString;
        if (randomString.length() == 2 )
            randomString = "0" + randomString;
        return "20210402141308" + randomString;
    }
}
