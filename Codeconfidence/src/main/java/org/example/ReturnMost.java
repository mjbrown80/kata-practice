package org.example;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

public class ReturnMost {
//    Write a method called returnMost/ReturnMost that takes in a
//    string and returns the character that appears the most in the string
//
//    EX returnMost("Hi, this is my string")  => returns i

    public static void main(String[] args) {
        char i = returnMost("Hi, this is my string");
        System.out.println("'i' is expected - actual is " + i);
        i = returnMost("HiHihihithere");
        System.out.println("'h' is expected - actual is " + i);
    }

    public static char returnMost(String str){
        //create Map <Character,int>
        Map<Character, Integer> letter = new HashMap<>();
        //loop through str
        for (int i = 0; i < str.length(); i++){
            //make sure we have an alpha char
            char c = str.charAt(i);
            //convert to lower case
            char lowerC = Character.toLowerCase(c);
            //if map doesn't contain char
            if (c != ' '){
                if (!letter.containsKey(lowerC)){
                    //add char to map with count of 1
                    letter.put(lowerC,1);
                }else{
                    //get count, increase by 1 , put char and count back in map
                    int count = letter.get(lowerC);
                    letter.put(lowerC, ++count);
                }
            }
        }
        //then determine who has the most
        //int most = 0;
        int most = 0;
        //String mostChar = '';
        char mostChar = '\0';
        //loop through the map
        for (Map.Entry<Character, Integer> entry: letter.entrySet()){
            //if(most < count)
            if (letter.get(entry.getKey()) > most){
                //most = count
                most = entry.getValue();
                //mostChar = key
                mostChar = entry.getKey();
            }
        }
        //return mostChar
        return mostChar;
    }

}
