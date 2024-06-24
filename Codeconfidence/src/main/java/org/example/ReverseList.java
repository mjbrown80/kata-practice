package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
//    Create a method called reverseList that takes in a List of strings called strings.
//    Return a new List in reverse order of the original.
//
//    For example:
//
//    reverseList( ["purple", "green", "blue", "yellow", "green" ])  →  ["green", "yellow", "blue", green", "purple" ]
//    reverseList( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"} ) →  ["way", "the", "all", "jingle", "bells", "jingle", "bells", "jingle"]

    public static void main(String[] args){
        List<String> input1 = Arrays.asList("purple", "green", "blue", "yellow", "green");
        List<String> expected1 = Arrays.asList("green", "yellow", "blue", "green", "purple");
        List<String> actual1 = reverseList(input1);

        System.out.println("Test 1:");
        System.out.println("Input:    " + input1);
        System.out.println("Expected: " + expected1);
        System.out.println("Actual:   " + actual1);
        System.out.println();

        // Test case 2
        List<String> input2 = Arrays.asList("jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way");
        List<String> expected2 = Arrays.asList("way", "the", "all", "jingle", "bells", "jingle", "bells", "jingle");
        List<String> actual2 = reverseList(input2);

        System.out.println("Test 2:");
        System.out.println("Input:    " + input2);
        System.out.println("Expected: " + expected2);
        System.out.println("Actual:   " + actual2);
        System.out.println();
    }

    public static List<String> reverseList(List<String> strings){
        List<String> updatedList = new ArrayList<>();

        return updatedList;
    }
}
