package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
//    Create a method called array2List that takes in a string array called strings.
//    Return a List containing the elements of strings in the same order.
//    Avoid using a standard library method that does the conversion for you. For example:
//
//    array2List( {"Apple", "Orange", "Banana"} ) →   ["Apple", "Orange", "Banana"]
//    array2List( {"Red", "Orange", "Yellow"} ) →   ["Red", "Orange", "Yellow"]
//    array2List( {"Left", "Right", "Forward", "Back"} ) →   ["Left", "Right", "Forward", "Back"]

    public static void main(String[] args){
        String[] input1 = {"Apple", "Orange", "Banana"};
        List<String> expected1 = Arrays.asList("Apple", "Orange", "Banana");
        List<String> actual1 = array2List(input1);

        System.out.println("Test 1:");
        System.out.println("Input:    " + Arrays.toString(input1));
        System.out.println("Expected: " + expected1);
        System.out.println("Actual:   " + actual1);
        System.out.println();

        // Test case 2
        String[] input2 = {"Red", "Orange", "Yellow"};
        List<String> expected2 = Arrays.asList("Red", "Orange", "Yellow");
        List<String> actual2 = array2List(input2);

        System.out.println("Test 2:");
        System.out.println("Input:    " + Arrays.toString(input2));
        System.out.println("Expected: " + expected2);
        System.out.println("Actual:   " + actual2);
        System.out.println();

        // Test case 3
        String[] input3 = {"Left", "Right", "Forward", "Back"};
        List<String> expected3 = Arrays.asList("Left", "Right", "Forward", "Back");
        List<String> actual3 = array2List(input3);

        System.out.println("Test 3:");
        System.out.println("Input:    " + Arrays.toString(input3));
        System.out.println("Expected: " + expected3);
        System.out.println("Actual:   " + actual3);
        System.out.println();
    }

    public static List<String> array2List(String[] strings){
        List<String> arrayString = new ArrayList<>();

        for (String word : strings){
            arrayString.add(word);
        }
        return arrayString;
    }
}
