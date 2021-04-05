package com.example.demo;

public class MyNumbers {
    public String rangeOf(String range) {

        String returnString = "";
        int secondInt = Integer.parseInt(getSecondString(range));
        for (int i = 1; i < secondInt; i++)
            if ("".equals(returnString))
                returnString = returnString + i;
            else
                returnString = returnString + "," + i;
        return returnString;
    }

    private String getSecondString(String range) {
        return range.substring(3, 4);
    }
}
