package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class calculateAverage {
    /* * *
Prompt: Write a method called calculateAverage that when given a List of whole numbers, calculates their average.
* * */

        public static void main(String[] args) {
            // Tests
            List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, -10));
            System.out.println("Expected: -2.3333... | Actual: " + calculateAverage(list1));

            List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
            System.out.println("Expected: 5.5 | Actual: " + calculateAverage(list2));

            List<Integer> list3 = new ArrayList<>(Arrays.asList(80, 99, 100));
            System.out.println("Expected: 93.0 | Actual: " + calculateAverage(list3));
        }

        public static double calculateAverage(List<Integer> nums){
            double sum = 0;
            for (Integer num : nums){
                sum += num;
            }

            double average =  sum / nums.size();
            return average;
        }

    }
