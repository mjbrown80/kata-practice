package org.example;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
//    Create a method called list2Array that takes in a List of strings called strings.
//    Return an array containing the same strings in the same order.
//    Avoid using a standard library method that does the conversion for you.
//
//    For example:
//
//    list2Array( ["aa", "ab", "ac"] ) →   {"aa", "ab", "ac"}
//    list2Array( ["as", "df", "jk"] ) →   {"as", "df", "jk"}
//    list2Array( ["aaa", "bbb", "ccc", "ddd"] ) →   {"aaa", "bbb", "ccc", "ddd"}

    public static void main(String[] args){
        List<String> input1 = Arrays.asList("aa", "ab", "ac");
        String[] expected1 = {"aa", "ab", "ac"};
        String[] actual1 = list2Array(input1);

        System.out.println("Test 1:");
        System.out.println("Input:    " + input1);
        System.out.println("Expected: " + Arrays.toString(expected1));
        System.out.println("Actual:   " + Arrays.toString(actual1));
        System.out.println();

        // Test case 2
        List<String> input2 = Arrays.asList("as", "df", "jk");
        String[] expected2 = {"as", "df", "jk"};
        String[] actual2 = list2Array(input2);

        System.out.println("Test 2:");
        System.out.println("Input:    " + input2);
        System.out.println("Expected: " + Arrays.toString(expected2));
        System.out.println("Actual:   " + Arrays.toString(actual2));
        System.out.println();

        // Test case 3
        List<String> input3 = Arrays.asList("aaa", "bbb", "ccc", "ddd");
        String[] expected3 = {"aaa", "bbb", "ccc", "ddd"};
        String[] actual3 = list2Array(input3);

        System.out.println("Test 3:");
        System.out.println("Input:    " + input3);
        System.out.println("Expected: " + Arrays.toString(expected3));
        System.out.println("Actual:   " + Arrays.toString(actual3));
        System.out.println();
    }

    public static String[] list2Array(List<String> strings){
        String[] result = new String[strings.size()];

        for (int i = 0; i < strings.size(); i++){
            result[i] = strings.get(i);
        }
            return result;

//        String[] result1 = strings.toArray(new String[0]);
//        return result1;
    }
}
