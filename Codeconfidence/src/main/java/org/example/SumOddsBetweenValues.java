package org.example;

public class SumOddsBetweenValues {
//    Create a method called sumOddsBetweenValues that takes in two integers
//    start and end. Return the sum of the odd integers between start and end
//    inclusive. You can assume end isn't less than start (but they may be equal).
//
//    For example:
//
//    sumOddsBetweenValues(0, 5) → 9
//    sumOddsBetweenValues(28,30) → 29
//    sumOddsBetweenValues(18, 18) → 0

    public static void main(String[] args){
        System.out.println("Test Case 1: Expected 9, Actual " + sumOddsBetweenValues(0, 5));
        System.out.println("Test Case 2: Expected 29, Actual " + sumOddsBetweenValues(28, 30));
        System.out.println("Test Case 3: Expected 0, Actual " + sumOddsBetweenValues(18, 18));
        System.out.println("Test Case 4: Expected 69, Actual " + sumOddsBetweenValues(20, 25));
        System.out.println("Test Case 5: Expected 2500, Actual " + sumOddsBetweenValues(1, 100));
        System.out.println("Test Case 6: Expected 0, Actual " + sumOddsBetweenValues(10, 10));
        System.out.println("Test Case 7: Expected -9, Actual " + sumOddsBetweenValues(-5, -1));
        System.out.println("Test Case 8: Expected 41, Actual " + sumOddsBetweenValues(41, 40));
    }

    public static int sumOddsBetweenValues(int start, int end){
        if (start == end && start % 2 != 0){
            return start;
        }
        int sumOdd = 0;
        for (int i = start; i <= end; i++){
            if(i % 2 != 0){
                sumOdd += i;
            }
        }
        return sumOdd;
    }
}
