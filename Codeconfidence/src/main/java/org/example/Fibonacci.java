package org.example;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
//    Create a method called fibonacci with no parameters.
//    In a Fibonacci sequence, every number after the first two is the sum of the two preceding ones.
//    Return an array of integers containing the Fibonacci sequence of 0, 1, 1, 2, 3, and so on for the values less than 2000.
//
//    For example:
//
//    fibonacci() → {1, 1, 2, 3, 5, 8, 13, ... 987, 1597}

    public static void main(String[] args){

    }

    public static int[] fibonacci(){
        List<Integer> list = new ArrayList<>();
        int fib1 = 1;
        int fib2 = 1;

        list.add(fib1);
        list.add(fib2);

        while(true){
            int nextFib = fib1 + fib2;

            if(nextFib >= 2000){
                break;
            }
            list.add(nextFib);
            fib1 = fib2;
            fib2 = nextFib;
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            result[i] += list.get(i);
        }

        return result;
//        int[] result = new int[2000];
//        result[0] = 1;
//        result[1] = 1;
//
//            for (int i = 2; i < result.length; i++){
//                if (result[i] < 2000){
//                    int previous = result[i-1];
//                    int twoPrevious = result[i-2];
//                    result[i] = twoPrevious + previous;
//                }
//
//            }
//
//        return result;
    }
}
