package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    /*
Given an array of Strings, count how many times each word appears.
Write a method called wordCount that takes in an array of Strings
and returns a Map with the word as a key and the count as an integer

Example:
wordCount(["is", "a", "bear", "is", "a"]) -> {"is": 2, "a": 2, "bear":1}
*/

    public static void main(String[] args) {

        System.out.println("Expected: a: 5, b: 2, c: 1, d:1 | Actual: " + wordCount(new String[] {"a", "a", "b", "c","d", "a", "a", "a", "b"}));

        System.out.println("Expected: a: 1, b: 2, c: 1, d:1 | Actual: " + wordCount(new String[] {"a", "b", "c","d", "b"}));
    }

    public static Map<String, Integer> wordCount(String[] words){
        Map<String, Integer> result = new HashMap<>();

        for (String word : words){
            if (result.containsKey(word)){
                result.put(word, result.get(word) + 1);
            }else{
               result.put(word, 1);
            }
        }

        return result;
    }

}
