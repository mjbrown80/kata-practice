package org.example;

public class SumOfNumber {
//    DESCRIPTION:
//    Given two integers a and b, which can be positive or negative,
//    find the sum of all the integers between and including them and return it.
//    If the two numbers are equal return a or b.
//
//            Note: a and b are not ordered!
//
//    Examples (a, b) --> output (explanation)
//        (1, 0) --> 1 (1 + 0 = 1)
//        (1, 2) --> 3 (1 + 2 = 3)
//        (0, 1) --> 1 (0 + 1 = 1)
//        (1, 1) --> 1 (1 since both are same)
//        (-1, 0) --> -1 (-1 + 0 = -1)
//        (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
//    Your function should only return a number,
//    not the explanation about how you get that number.

    public static void main(String[] args){
        int a1 = 1;
        int b1 = 0;
        int actual1 = sumOfNumber(a1, b1);
        int expected1 = 1;
        System.out.println("Test case 1 - Actual: " + actual1 + ", Expected: " + expected1);

        // Test case 2
        int a2 = 1;
        int b2 = 2;
        int actual2 = sumOfNumber(a2, b2);
        int expected2 = 3;
        System.out.println("Test case 2 - Actual: " + actual2 + ", Expected: " + expected2);

        // Test case 3
        int a3 = 0;
        int b3 = 1;
        int actual3 = sumOfNumber(a3, b3);
        int expected3 = 1;
        System.out.println("Test case 3 - Actual: " + actual3 + ", Expected: " + expected3);

        // Test case 4
        int a4 = 1;
        int b4 = 1;
        int actual4 = sumOfNumber(a4, b4);
        int expected4 = 1;
        System.out.println("Test case 4 - Actual: " + actual4 + ", Expected: " + expected4);

        // Test case 5
        int a5 = -1;
        int b5 = 0;
        int actual5 = sumOfNumber(a5, b5);
        int expected5 = -1;
        System.out.println("Test case 5 - Actual: " + actual5 + ", Expected: " + expected5);

        // Test case 6
        int a6 = -1;
        int b6 = 2;
        int actual6 = sumOfNumber(a6, b6);
        int expected6 = 2;
        System.out.println("Test case 6 - Actual: " + actual6 + ", Expected: " + expected6);
    }

    public static int sumOfNumber(int a, int b){
        int sum = 0;

        if (a == b){
            return a;
        }else if (a > b){
           for (int i = b; i <= a; i++){
               sum += i;
           }
        } else {
               for (int i = a; i <= b; i++){
                   sum += i;
               }
           }

        return sum;

//        return(a + b) * (Math.abs(a - b) + 1) / 2;
    }

}
