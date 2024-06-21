package org.example;

import java.util.Arrays;

public class FizzArrayThree {
//    Create a method called fizzArray3 that takes in two integers start and end.
//    Return a new array containing the sequence of integers from start up to but not including end.
//    You can assume end is greater than or equal to start.
//
//    For example:
//
//    fizzArray3(5, 10) → {5, 6, 7, 8, 9}
//    fizzArray3(11, 12) → {11}
//    fizzArray3(3, 3) → {}
    public static void main(String[] args){
        int[] result1 = fizzArray3(5, 10);
        System.out.println("Test Case 1: Expected [5, 6, 7, 8, 9], Actual " + Arrays.toString(result1));

        int[] result2 = fizzArray3(11, 12);
        System.out.println("Test Case 2: Expected [11], Actual " + Arrays.toString(result2));

        int[] result3 = fizzArray3(3, 3);
        System.out.println("Test Case 3: Expected [], Actual " + Arrays.toString(result3));

        int[] result4 = fizzArray3(-1, 4);
        System.out.println("Test Case 4: Expected [-1, 0, 1, 2, 3], Actual " + Arrays.toString(result4));

        int[] result5 = fizzArray3(0, 0);
        System.out.println("Test Case 5: Expected [], Actual " + Arrays.toString(result5));

        int[] result6 = fizzArray3(-5, -1);
        System.out.println("Test Case 6: Expected [-5, -4, -3, -2], Actual " + Arrays.toString(result6));
    }

    public static int[] fizzArray3(int start, int end){
        int number = end - start;
        int[] fizzy = new int[number];

        for (int i = start; i < end; i++){
            fizzy[i - start] = i;
        }
        return fizzy;
    }
}
