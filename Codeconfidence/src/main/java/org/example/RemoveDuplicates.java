package org.example;

import java.util.*;

public class RemoveDuplicates {

//    Write a method called removeDuplicates/RemoveDuplicates that
//    takes a List of integers as input and removes all its duplicates.
//
//    removeDuplicates({1, 2, 3}) → {1, 2, 3}
//    removeDuplicates({4, 4, 4, 4, 8, 12, 16, 16}) → {4, 8, 12, 16}
//    removeDuplicates({99, 88, 77, 777, 66, 66}) → {99, 88, 77, 777, 66}

    public static void main(String[] args) {
        // Tests
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 5));
        System.out.println("Expected: [2, 3, 4, 5] | Actual: " + removeDuplicates(list1));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(100, 201, 302));
        System.out.println("Expected: [100, 201, 302] | Actual: " + removeDuplicates(list2));

        List<Integer> list3 = new ArrayList<>(Arrays.asList(8, 8, 8, 8, 1));
        System.out.println("Expected: [8, 1] | Actual: " + removeDuplicates(list3));

    }

    public static List<Integer> removeDuplicates(List<Integer> nums){
        List<Integer> revised = new ArrayList<>();
        for (Integer num : nums){
            if (!revised.contains(num)){
                revised.add(num);
            }
        }
        return revised;
    }

//    public static List<Integer> removeDuplicates(List<Integer> nums){
//        Set<Integer> revised = new LinkedHashSet<>(nums);
//
//        return new ArrayList<Integer>(revised);
//    }
}
