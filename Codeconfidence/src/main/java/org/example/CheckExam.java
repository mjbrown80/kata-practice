package org.example;

public class CheckExam {
    /*
The first input array is the key to the correct answers to an exam, like ["a", "a", "b", "d"].
The second one contains a student's submitted answers.
The two arrays are not empty and are the same length.
Return the score for this array of answers, giving +4 for each correct answer,
-1 for each incorrect answer, and +0 for each blank answer, represented as an empty string (in C the space character is used).
If the score < 0, return 0.
For example:
    Correct answer    |    Student's answer   |   Result
 ---------------------|-----------------------|-----------
 ["a", "a", "b", "b"]   ["a", "c", "b", "d"]  →     6
 ["a", "a", "c", "b"]   ["a", "a", "b", "" ]  →     7
 ["a", "a", "b", "c"]   ["a", "a", "b", "c"]  →     16
 ["b", "c", "b", "a"]   ["" , "a", "a", "c"]  →     0
*/
    public static void main(String[] args) {
        System.out.println("Expect: 6 - Actual: " + checkExam(new String[] { "a", "a", "b", "b"}, new String[] {"a", "c","b", "d"}));
        System.out.println("Expect: 7 - Actual: " + checkExam(new String[] { "a", "a", "c", "b"}, new String[] {"a", "a","b", ""}));
        System.out.println("Expect: 16 - Actual: " + checkExam(new String[] { "a", "a", "b", "c"}, new String[] {"a", "a","b", "c"}));
        System.out.println("Expect: 0 - Actual: " + checkExam(new String[] { "b", "c", "b", "a"}, new String[] {"", "a","a", "c"}));
    }

    public static int checkExam(String[] a, String[] b){
        int score = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i].equals(b[i])){
                score += 10;
            }else if (!a[i].equals(b[i])){
                score -= 1;
            } else if (b[i].equals("")) {
                score += 0;
            }
        }
        return score;
        }

    }

