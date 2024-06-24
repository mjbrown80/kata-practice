package org.example;

import java.util.ArrayList;

public class ReverseString {
//    Create a method called reverseString that takes in a string called str.
//    Return a string containing str in reverse order. str may be empty, but not null.
//
//    For example:
//
//    reverseString(“Hello!”) → “!olleH”
//    reverseString(“Kata”) → “ataK”
//    reverseString(“”) → “”

    public static void main(String[] args){
        String input1 = "Hello!";
        String input2 = "Kata";
        String input3 = "";

        // Expected results
        String expected1 = "!olleH";
        String expected2 = "ataK";
        String expected3 = "";

        // Actual results
        String actual1 = reverseString(input1);
        String actual2 = reverseString(input2);
        String actual3 = reverseString(input3);

        // Print test results
        System.out.println("Test 1:");
        System.out.println("Input:    " + input1);
        System.out.println("Expected: " + expected1);
        System.out.println("Actual:   " + actual1);
        System.out.println();

        System.out.println("Test 2:");
        System.out.println("Input:    " + input2);
        System.out.println("Expected: " + expected2);
        System.out.println("Actual:   " + actual2);
        System.out.println();

        System.out.println("Test 3:");
        System.out.println("Input:    " + input3);
        System.out.println("Expected: " + expected3);
        System.out.println("Actual:   " + actual3);
        System.out.println();
    }

    public static String reverseString(String str){
        String result = "";

        if(str.length() == 0){
            return str;
        }
        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }
}
