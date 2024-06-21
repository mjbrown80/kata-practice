package org.example;

public class SumOdd {
//    Create a method called sumOdds with no parameters.
//    Return the sum of the odd integers between 1 and 100 inclusive.
//
//    For example:
//
//    sumOdds() → 2500

    public static void main(String[] args){
        System.out.println("Sum of odd numbers between 1 and 100: " + sumOdd());
    }

    public static int sumOdd(){
        int odd = 0;

        for (int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                odd += i;
            }
        }
        return odd;
    }
}
