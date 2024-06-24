package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntToDouble {
//    Create a method called arrayInt2ListDouble that takes in an integer array called ints.
//    Divide each value in ints by 2, and return them in a List of Doubles.
//
//    For example:
//
//    arrayInt2ListDouble( {5, 8, 11, 200, 97} ) →  [2.5, 4.0, 5.5, 100, 48.5]
//    arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) →  [372.5, 11.5, 22, 4508.5, 3]
//    arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) →  [42, 49.5, 1642.5, 6.5, 438.5]

    public static void main(String[] args){
        int[] input1 = {5, 8, 11, 200, 97};
        List<Double> expected1 = Arrays.asList(2.5, 4.0, 5.5, 100.0, 48.5);
        List<Double> actual1 = arrayInt2ListDouble(input1);

        System.out.println("Test 1:");
        System.out.println("Input:    " + Arrays.toString(input1));
        System.out.println("Expected: " + expected1);
        System.out.println("Actual:   " + actual1);
        System.out.println();

        // Test case 2
        int[] input2 = {745, 23, 44, 9017, 6};
        List<Double> expected2 = Arrays.asList(372.5, 11.5, 22.0, 4508.5, 3.0);
        List<Double> actual2 = arrayInt2ListDouble(input2);

        System.out.println("Test 2:");
        System.out.println("Input:    " + Arrays.toString(input2));
        System.out.println("Expected: " + expected2);
        System.out.println("Actual:   " + actual2);
        System.out.println();

        // Test case 3
        int[] input3 = {84, 99, 3285, 13, 877};
        List<Double> expected3 = Arrays.asList(42.0, 49.5, 1642.5, 6.5, 438.5);
        List<Double> actual3 = arrayInt2ListDouble(input3);

        System.out.println("Test 3:");
        System.out.println("Input:    " + Arrays.toString(input3));
        System.out.println("Expected: " + expected3);
        System.out.println("Actual:   " + actual3);
        System.out.println();
    }

    public static List<Double> arrayInt2ListDouble(int[] ints){
        List<Double> doubleArray = new ArrayList<>();

        for(int num : ints){
            double nums = num;
            nums = nums / 2;
            doubleArray.add(nums);
        }
        return doubleArray;
    }
}
