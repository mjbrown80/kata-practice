package org.example;

import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Menu");
            System.out.println("(1) - add");
            System.out.println("(2) - subtract");
            System.out.println("(3) - multiply");
            System.out.println("(4) - divide");
            System.out.println("(5) - quit");
            System.out.println("Enter choice: ");

            choice = Integer.parseInt(input.nextLine());

            switch (choice) { //only work for direct comparison -- not contains, or starts with
                case 1:
                    System.out.println("Add");
                    break;
                case 2:
                    System.out.println("Subtract");
                    break;
                case 3:
                    System.out.println("Multiply");
                    break;
                case 4:
                    System.out.println("Divide");
                    break;
                case 5:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Invalid Entry!");
            }
        } while (choice != 5);

        //write a loop that prints from 10 to 1
        //for loop
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //while
        System.out.println("while loop ------");
        int j = 10;
        while (j > 0) {
            System.out.println(j);
            j--;
        }

        //do while loop

        System.out.println("do while loop --------");
        j = 10;
        do {
            System.out.println(j);
            j--;
        } while (j > 0);
        System.out.println("nested loops");
        for (int i = 0; i < 5; i++) {
            for (int z = 3; z > 0; z--) {
                for (int a = 0; a <= 3; a++) {
                    System.out.println(i - z - a);
                }
            }
        }

        //write a method to determine if a string is a palindrome
        //if string is a palidrome return true

        String result = "aabbcccbbaa";
        System.out.println("Expected - true, Actual - " + isPalidrome(result));

        result = "aabbcc";
        System.out.println("Expected - false, Actual - " + isPalidrome(result));

        result = "";
        System.out.println("Expected -true, Actual - " +isPalidrome(result));

        result = "abc";
        System.out.println("Expected - false, Actual - " + isPalidrome(result));
    }
        //write method
        public static boolean isPalidrome(String str){//what does static mean? means this method belongs to the class
        //Know that a word is a palindrome is when first character is same as last, and second char is same as second to last, etc...
        //create an integer to hold the starting index, and integer to hold the ending index
            int start = 0;
            int end = str.length()-1;//index is one less than length of str

        // need some kind of loop
            while (start < end){
                //compare str at start to str at end -- if not equal return false
                if (str.charAt(start) != str.charAt(end)){
                    return false;//sends me back to the calling method
                }
                //else compare the next two
                start++;
                end--;
        }
            //if get to end, return true
            return true;
    }
}