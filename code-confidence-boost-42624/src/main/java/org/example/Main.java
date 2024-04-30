package org.example;

public class Main {
    public static void main(String[] args) {

            String input = "I am using Replit to improve programming";
            String result = "I using to improve programming";
            String search = "am Replit";
            System.out.println("Expected: " + result + " Actual: " + removeWords(input, search));
            input = "Here is a brand new line";
            result = "Here a new";
            search = "is brand line";
            System.out.println("Expected: " + result + " Actual: " + removeWords(input, search));
    }

    public static String removeWords(String string1, String subSeq){
        String[] subStrings = subSeq.split(" ");
        for (String s : subStrings){
            if (string1.contains(s)){
                string1 = string1.replaceAll(s, "");
            }
        }
        string1 = string1.replaceAll("  ", " ");
        return string1;
    }

//    public static String removeWords(String string1, String subSeq){
//        //loop through every word in subSql
//        //looking in String1 from that word, removing it
//        String returnStr = "";
//        String [] subStrings = subSeq.split(" "); //created an array of each word in subSequence
//        String [] string1str = string1.split(" "); //created array od each word in the string
//        for (String str: string1str){ //each substring word
//            boolean isFound = false;
//            for (String s: subStrings){
//                if (s.equals(str)){
//                    //match and need to remove it from string1
//                    isFound = true;
//                }
//            }
//            if (!isFound){ //if we don't find the word in the subSeq array, append it.
//                returnStr += str + " ";
//            }
//            }
//        return returnStr;
//        }
}