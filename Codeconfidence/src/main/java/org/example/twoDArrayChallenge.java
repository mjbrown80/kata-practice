package org.example;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class twoDArrayChallenge {
//    Problem Description:
//    Write a program that asks the user to enter a size of a 2D array (less than 10 X 10).
//    Create an array of size X size elements and load it with random integers between 1 and 100.
//    Ask the user to enter a target integer and determine if the integer is in the array
//    – if it is, printout the index of the integer.
//    CHALLENGE – determine if the array has any duplicates.

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        Random random = new Random();
        System.out.print("How big is the array?");
        int size = Integer.parseInt(input.nextLine());
//        if (size > 10){
//            System.out.println("Please enter number below 10.");
//            size = Integer.parseInt(input.nextLine());
//        }
        int[][] array = new int[size][size];
        for (int row = 0; row < size; row++){ //loads the array
            for (int col = 0; col < size; col++){
                array[row][col] = random.nextInt(100) + 1;
            }
        }
        //print out array
        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col++) {
            System.out.printf("%5d",array[row][col]);
            }
            System.out.println();
        }
        System.out.println("Enter a number to search for: ");
        int num = Integer.parseInt(input.nextLine());
        boolean found = false;

        for (int row = 0; row < size; row++){ //Search for the number
            for (int col = 0; col < size; col++) {
                if (num == array[row][col]){
                    System.out.println(num + " found at position: " + (row + 1) + " , " + (col + 1));
                    found = true;
                }
            }
            }
        if (!found){
            System.out.println(num + " not found in Array!");
        }

        System.out.println("Searching for duplicates: ");

        Set<Integer> duplicates = new HashSet<>();
        boolean hasDuplicates = false;

        for (int[] row : array){
            for (int element : row){
                if (duplicates.contains(element)){
                    hasDuplicates = true;
                    System.out.println("Duplicate found: " + element);
                }else {
                    duplicates.add(element);
                }
            }
        }
        if (!hasDuplicates){
            System.out.println("No duplicates found!");
        }
   }
}
