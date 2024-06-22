package org.example;

import javax.print.attribute.IntegerSyntax;
import java.util.Arrays;
import java.util.List;

public class FindLargest {
//    Create a method called findLargest that takes in a List of integers called nums.
//    Return the largest value in nums.
//
//    For example:
//
//    findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) →  33333
//    findLargest( [987, 1234, 9381, 731, 43718, 8932] ) →  43718
//    findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) →  64362.

    public static void main(String[] args){
        int result1 = findLargest(Arrays.asList(11, 200, 43, 84, 9917, 4321, 1, 33333, 8997));
        System.out.println("Test Case 1: Expected 33333, Actual " + result1);

        int result2 = findLargest(Arrays.asList(987, 1234, 9381, 731, 43718, 8932));
        System.out.println("Test Case 2: Expected 43718, Actual " + result2);

        int result3 = findLargest(Arrays.asList(34070, 1380, 81238, 7782, 234, 64362, 627));
        System.out.println("Test Case 3: Expected 81238, Actual " + result3);

        int result4 = findLargest(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Test Case 4: Expected 5, Actual " + result4);

        int result6 = findLargest(Arrays.asList(1000));
        System.out.println("Test Case 6: Expected 1000, Actual " + result6);
    }

    public static int findLargest(List<Integer> nums){
        int max = 0;

        for (int num : nums){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

}
