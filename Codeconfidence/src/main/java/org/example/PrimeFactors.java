package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors {
//    Create a method called primeFactors that takes in an integer n.
//    Return an integer array of the [prime factors] of n(https://www.mathsisfun.com/definitions/prime-factor.html).
//    Prime factors are the numbers you can multiply to get n that you can't break down into any smaller factors.
//    You can assume the input is greater than 1.
//
//            For example:
//
//            primeFactors(6) → {2, 3}
//    primeFactors(28) → {2, 2, 7}
//    primeFactors(667) → {23, 29}

    public static void main(String[] args){
        int[] expected1 = {2, 3};
        int[] actual1 = primeFactors(6);
        System.out.println("Testing primeFactors(6)");
        System.out.println("Expected: " + Arrays.toString(expected1));
        System.out.println("Actual:   " + Arrays.toString(actual1));
        System.out.println(Arrays.equals(expected1, actual1) ? "Test Passed" : "Test Failed");
        System.out.println();

        int[] expected2 = {2, 2, 7};
        int[] actual2 = primeFactors(28);
        System.out.println("Testing primeFactors(28)");
        System.out.println("Expected: " + Arrays.toString(expected2));
        System.out.println("Actual:   " + Arrays.toString(actual2));
        System.out.println(Arrays.equals(expected2, actual2) ? "Test Passed" : "Test Failed");
        System.out.println();

        int[] expected3 = {23, 29};
        int[] actual3 = primeFactors(667);
        System.out.println("Testing primeFactors(667)");
        System.out.println("Expected: " + Arrays.toString(expected3));
        System.out.println("Actual:   " + Arrays.toString(actual3));
        System.out.println(Arrays.equals(expected3, actual3) ? "Test Passed" : "Test Failed");
        System.out.println();

        int[] expected4 = {2, 2, 5, 5};
        int[] actual4 = primeFactors(100);
        System.out.println("Testing primeFactors(100)");
        System.out.println("Expected: " + Arrays.toString(expected4));
        System.out.println("Actual:   " + Arrays.toString(actual4));
        System.out.println(Arrays.equals(expected4, actual4) ? "Test Passed" : "Test Failed");
        System.out.println();
        
        int[] expected5 = {97};
        int[] actual5 = primeFactors(97);
        System.out.println("Testing primeFactors(97)");
        System.out.println("Expected: " + Arrays.toString(expected5));
        System.out.println("Actual:   " + Arrays.toString(actual5));
        System.out.println(Arrays.equals(expected5, actual5) ? "Test Passed" : "Test Failed");
        System.out.println();
    }

    public static int[] primeFactors(int n){
        List<Integer> list = new ArrayList<>();
        int pn = 2;

        while(n > 1){
            if (n % pn == 0){
                list.add(pn);
                n = n / pn;
            }else{
                pn++;
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
