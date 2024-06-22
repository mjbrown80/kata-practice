package org.example;

public class Factorial {
//    Create a method called factorial that takes in an integer n
//    and returns the factorial of the number.
//    A factorial is the product of all positive integers less than or equal to n.
//
//    For example:
//
//    factorial(3) → 6 (since 1 * 2 * 3 = 6)
//    factorial(4) → 24 (since 1 * 2 * 3 * 4 = 24)
//    factorial(10) → 3628800

    public static void main(String[] args){
        int result1 = factorial(3);
        System.out.println("Test Case 1: Expected 6, Actual " + result1);

        int result2 = factorial(4);
        System.out.println("Test Case 2: Expected 24, Actual " + result2);

        int result3 = factorial(10);
        System.out.println("Test Case 3: Expected 3628800, Actual " + result3);

        int result4 = factorial(0);
        System.out.println("Test Case 4: Expected 1, Actual " + result4);

        int result5 = factorial(1);
        System.out.println("Test Case 5: Expected 1, Actual " + result5);

        int result6 = factorial(5);
        System.out.println("Test Case 6: Expected 120, Actual " + result6);
    }

    public static int factorial(int n){
        int total = 1;

        for (int i = 2; i <= n; i++){
            total *= i;
        }
        return total;
    }
}
