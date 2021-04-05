package com.example.demo;

public class FizzBuzz {
    public String getResult(int i) {
        String result = "";

        if(i%3 == 0) {
            result = "Fizz";
        } else if(i%5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(i);
        }
        return result;
    }
}
