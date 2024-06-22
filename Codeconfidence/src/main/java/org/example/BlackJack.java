package org.example;

public class BlackJack {
//    Create a method called blackjack that takes in two integers, a and b.
//    Return whichever value is nearest to 21 without going over.
//    Return 0 if they both go over.
//
//    For example:
//
//    blackjack(19, 21) → 21
//    blackjack(21, 19) → 21
//    blackjack(19, 22) → 19

    public static void main(String[] args){
        int result1 = blackjack(19, 21);
        System.out.println("Test Case 1: Expected 21, Actual " + result1);

        int result2 = blackjack(21, 19);
        System.out.println("Test Case 2: Expected 21, Actual " + result2);

        int result3 = blackjack(19, 22);
        System.out.println("Test Case 3: Expected 19, Actual " + result3);

        int result4 = blackjack(22, 22);
        System.out.println("Test Case 4: Expected 0, Actual " + result4);

        int result5 = blackjack(20, 18);
        System.out.println("Test Case 5: Expected 20, Actual " + result5);

        int result6 = blackjack(22, 18);
        System.out.println("Test Case 6: Expected 18, Actual " + result6);

        int result7 = blackjack(23, 25);
        System.out.println("Test Case 7: Expected 0, Actual " + result7);

        int result8 = blackjack(21, 21);
        System.out.println("Test Case 8: Expected 21, Actual " + result8);
    }

    public static int blackjack(int a, int b){
        if(a > 21 && b <= 21){
            return b;
        }if(a <= 21 && b > 21){
            return a;
        }if(a > 21 && b > 21){
            return 0;
        }if( a <= 21 && b <= 21){
            if(a < b){
                return b;
            }else {
                return a;
            }
        }
        return 0;
    }
}
