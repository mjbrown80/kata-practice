package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class distinctValues {
//    Create a method called distinctValues that takes in a List of strings called strings.
//    Return a List that contains the distinct values in strings.
//
//    For example:
//
//    distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) →  ["red", "yellow", "green", "blue", "purple"]
//    distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) →  ["jingle", "bells", "all", "the", "way"]

    public static void main(String[] args){
        List<String> input1 = Arrays.asList("red", "yellow", "green", "yellow", "blue", "green", "purple");
        List<String> expected1 = Arrays.asList("red", "yellow", "green", "blue", "purple");
        List<String> actual1 = distinctValues(input1);

        System.out.println("Test 1:");
        System.out.println("Input:    " + input1);
        System.out.println("Expected: " + expected1);
        System.out.println("Actual:   " + actual1);
        System.out.println();

        // Test case 2
        List<String> input2 = Arrays.asList("jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way");
        List<String> expected2 = Arrays.asList("jingle", "bells", "all", "the", "way");
        List<String> actual2 = distinctValues(input2);

        System.out.println("Test 2:");
        System.out.println("Input:    " + input2);
        System.out.println("Expected: " + expected2);
        System.out.println("Actual:   " + actual2);
        System.out.println();
    }

    public static List<String> distinctValues(List<String> strings){
        List<String> updatedList = new ArrayList<>();

        for (String word : strings){
            if (!updatedList.contains(word)){
                updatedList.add(word);
            }
        }

        return updatedList;
    }

}
