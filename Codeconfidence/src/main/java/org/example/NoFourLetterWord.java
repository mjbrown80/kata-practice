package org.example;

import java.util.ArrayList;
import java.util.List;

public class NoFourLetterWord {
//    Create a method called no4LetterWords that takes in an array of strings
//    called strings. Return a List containing the elements of strings
//    in the same order except for any that contain exactly 4 characters.
//
//    For example:
//
//    no4LetterWords( {"Train", "Boat", "Car"} ) →   ["Train", "Car"]
//    no4LetterWords( {"Red", "White", "Blue"} ) →   ["Red", "White"]
    public static void main(String[] args) {
        String[] testArray1 = {"Train", "Boat", "Car"};
        System.out.println("Test Case 1: Expected [Train, Car], Actual " + no4LetterWords(testArray1));

        String[] testArray2 = {"Red", "White", "Blue"};
        System.out.println("Test Case 2: Expected [Red, White], Actual " + no4LetterWords(testArray2));

        String[] testArray3 = {"One", "Two", "Four"};
        System.out.println("Test Case 3: Expected [One], Actual " + no4LetterWords(testArray3));

        String[] testArray4 = {"This", "is", "a", "test"};
        System.out.println("Test Case 4: Expected [is, a], Actual " + no4LetterWords(testArray4));

        String[] testArray5 = {"Java", "C++", "Python"};
        System.out.println("Test Case 5: Expected [C++, Python], Actual " + no4LetterWords(testArray5));

        String[] testArray6 = {};
        System.out.println("Test Case 6: Expected [], Actual " + no4LetterWords(testArray6));

        String[] testArray7 = {"ABCD", "EFGH", "IJKL"};
        System.out.println("Test Case 7: Expected [], Actual " + no4LetterWords(testArray7));
    }

    public static List<String> no4LetterWords(String[] str){
        List<String> words = new ArrayList<>();

        for (String word: str){
            if (word.length() != 4){
                words.add(word);
            }
        }
        return words;
    }
}
