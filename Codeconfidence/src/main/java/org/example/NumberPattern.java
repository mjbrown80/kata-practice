package org.example;

public class NumberPattern {
    /*
Write a method called numberPattern that accepts an integer parameter.
Using the int parameter 'num' return a String triangle pattern of numbers from 1 to num.

Example:
numberPattern(5) returns
"1
22
333
4444
55555"

*/
    public static void main(String[] args){
        System.out.println(numberPattern(5));
        System.out.println();
        System.out.println(numberPattern(7));
    }

    public static String numberPattern(int num){
//        String pattern = "";
//        for (int i = 1; i <= num; i++){
//           int j = 1;
//           while (j <= i){
//               pattern += i;
//               j++;
//           }
//           pattern +=  "\n";
//        }
//        return pattern;

        String pattern = "";

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                pattern += i;
            }
            pattern += "\n";
        }
        return pattern;
    }
}
