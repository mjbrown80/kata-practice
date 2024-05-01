package org.example;

public class GreenTicket {

    /*
Exercise 3: greenTicket
Create an integer method called greenTicket that takes in three integers, "a". "b", and "c"
You have a green lottery ticket, with ints a, b, and c on it.
If the numbers are all different from each other,
the result is 0. If all of the numbers are the same,
the result is 20. If two of the numbers are the same, the  result is 10.
greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
*/
    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 3;

        int result = greenTicket(a, c, b);

        System.out.println("Expected: 10 - Actual: " + result);
        System.out.println("Expected: 20 - Actual: " + greenTicket(5, 5, 5));
        System.out.println("Expected: 0 - Actual: " + greenTicket(3, 6, 8));
    }

    public static int greenTicket(int a , int b, int c){

        if (a == b && b == c){
            return 20;
        } else if (a == b || b == c || a ==c) {
            return 10;
        }else{
            return 0;
        }

    }
}
