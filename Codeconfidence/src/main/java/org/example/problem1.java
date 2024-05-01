package org.example;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;



public class problem1 {


    //Problem:
//    Given a list of integers, write a program to classify
//    each number into one of the following categories:
    //
//    Positive Even: Even numbers greater than zero
//    Positive Odd: Odd numbers greater than zero
//    Negative Even: Even numbers less than zero
//    Negative Odd: Odd numbers less than zero
//    Zero: the number zero
//    Your task is to implement a function called numberClassification that takes a list of
//    integers as input and returns a map that contains the count of each category.
//    The map should have the categories as keys and count of numbers in each category as values


    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(0);
        numbers.add(7);
        numbers.add(-8);

        Map<String, Integer> result = numberClassification(numbers);
        System.out.println("Expected: {Negative Even=2, Negative Odd=1, Zero=1, Positive Odd=4, Positive Even=2} - \nActual: " + result);
    }

        public static Map<String, Integer> numberClassification(List<Integer> numbers){

            Map<String, Integer> map = new HashMap<>();
            int positiveEven = 0;
            int positiveOdd = 0;
            int negativeEven = 0;
            int negativeOdd = 0;
            int zero = 0;

            for (int i = 0; i < numbers.size(); i++){
                if (numbers.get(i) > 0 && numbers.get(i) % 2 == 0){
                    positiveEven++;
                }
                else if (numbers.get(i) > 0 && numbers.get(i) % 2 != 0){
                    positiveOdd++;
                }
                else if (numbers.get(i) < 0 && numbers.get(i) % 2 == 0){
                    negativeEven++;
                }
                else if (numbers.get(i) < 0 && numbers.get(i) % 2 != 0){
                    negativeOdd++;
                }
                else if (numbers.get(i) == 0){
                    zero++;

                }

                map.put("Positive Odd", positiveOdd);
                map.put("Negative Odd", negativeOdd);
                map.put("Negative Even", negativeEven);
                map.put("Positive Even", positiveEven);
                map.put("Zero", zero);

            }
            return map;
            }
        }






