package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyNumbersTest {

    @Test
    public void rangeOf_0_0_without_start_end_should_be_emptyString () {
        //Arrage
        String emptyString = "";
        MyNumbers number = new MyNumbers();

        //Act
        String actualResult = number.rangeOf("[0,0]");

        //Assert
        assertEquals(emptyString, actualResult);
    }

    @Test
    public void rangeOf_0_1_without_start_end_should_be_emptyString () {
        String emptyString = "";
        MyNumbers number = new MyNumbers();

        String actualResult = number.rangeOf("[0,1]");

        assertEquals(emptyString, actualResult);
    }

    @Test
    public void rangeOf_0_2_without_start_end_should_be_onlyOne () {
        String expectedResult = "1";
        MyNumbers number = new MyNumbers();

        String actualResult = number.rangeOf("[0,2]");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void rangeOf_0_3_without_start_end_should_be_one_and_two () {
        String expectedResult = "1,2";
        MyNumbers number = new MyNumbers();

        String actualResult = number.rangeOf("[0,3]");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void rangeOf_0_4_without_start_end_should_be_one_and_two_and_three () {
        String expectedResult = "1,2,3";
        MyNumbers number = new MyNumbers();

        String actualResult = number.rangeOf("[0,4]");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void rangeOf_0_9_without_start_end_should_be_one_to_eight () {
        String expectedResult = "1,2,3,4,5,6,7,8";
        MyNumbers number = new MyNumbers();

        String actualResult = number.rangeOf("[0,9]");

        assertEquals(expectedResult, actualResult);
    }

}
