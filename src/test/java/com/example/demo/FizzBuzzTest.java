package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzBuzz_of_1_should_be_1 () {
        //Arrage
        FizzBuzz fizzBuzz = new FizzBuzz();

        //Act
        String actualResult = fizzBuzz.getResult(1);

        //Assert
        assertEquals("1", actualResult);
    }

    @Test
    public void fizzBuzz_of_2_should_be_2 () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.getResult(2);
        assertEquals("2", actualResult);
    }

    @Test
    public void fizzBuzz_of_3_should_be_Fizz () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.getResult(3);
        assertEquals("Fizz", actualResult);
    }

    @Test
    public void fizzBuzz_of_5_should_be_Buzz () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.getResult(5);
        assertEquals("Buzz", actualResult);
    }

    @Test
    public void fizzBuzz_of_6_should_be_Fizz () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.getResult(6);
        assertEquals("Fizz", actualResult);
    }

    @Test
    public void fizzBuzz_of_10_should_be_Buzz () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.getResult(10);
        assertEquals("Buzz", actualResult);
    }

}
