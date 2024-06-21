package org.example;

public class CountVowels {
//    Problem:
//    Given a string, write a method called countVowels
//    that counts how many vowels are in the string.
//
//    As an added challenge, every time there is a ‘u’, print out ‘u found me!’

    public static void main(String[] args){

        System.out.println("expected 15 " + "actual " + countVowels("supercalifragisticexpialisdocious!"));
        System.out.println("expected 10 " + "actual " + countVowels("uuuuuuuuuu"));
    }

    public static int countVowels(String s){

        int sum = 0;

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            switch(ch) {
                case 'u':
                    System.out.println("u found me!");
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                    sum++;
            }
        }
        return sum;

//        int sum = 0;
//
//        for (int i = 0; i < s.length(); i++){
//            char ch = s.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'){
//                sum++;
//            } else if (ch == 'u') {
//                sum++;
//                System.out.println("u found me!");
//            }
//        }
//        return sum;
    }
}
