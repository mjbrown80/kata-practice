package org.example;

public class DiamondPattern {
//    Problem Description:

//    Write a Java function called diamondPattern that takes an
//    odd integer n as input and prints a diamond pattern
//    made of asterisks ('*') with a width of n characters.
//
//    Example:
//    diamond(5) =>
//            *
//            ***
//            *****
//            ***
//            *

        public static void main(String[] args) {
            System.out.println("calling with 5:");
            diamondPattern(5);
            System.out.println("\ncalling with 7:");
            diamondPattern(7);
        }

        //Whatever number passed in is the total number on each line
        //first line will be 2 spaces, 1 star, 2 of spaces
        //second line will ve 1 , 3 star, 1 space
        //third line will be 5 stars no spaces
        //fourth 1 spaces, 3 stars, 1 space
        //fifth 2 spaces, 1 star, 2 spaces
        public static void diamondPattern(int odd){
            int midRow = odd / 2;
            int numberSpaces = midRow;// when we begin, we need to know how many spaces
            int numberStars = 1;//and how many stars

            //top half of diamond
            for (int i = 0; i < midRow; i++){
                for (int j = 0; j < numberSpaces; j++){
                    System.out.print(" ");
                }
                for (int j = 0; j < numberStars; j++){
                    System.out.print("*");
                }
                numberSpaces--;
                numberStars+=2;//each row adds 2 stars
                System.out.println();
            }
            for (int i = 0; i < numberStars; i++){
                System.out.print("*");
            }
            System.out.println();
            numberStars -=2;
            numberSpaces = 1;

            for (int i = 0; i < midRow; i++){
                for (int j = 0; j < numberSpaces; j++){
                    System.out.print(" ");
                }
                for (int j = 0; j < numberStars; j++){
                    System.out.print("*");
                }
                numberSpaces++;
                numberStars-=2;//each row removes 2 stars
                System.out.println();
            }
        }
    }

