package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class RotateNumbers {

    //worked through with tech elevator alumni
    /*
Take a number: 56789. Rotate left, you get 67895.
Keep the first digit in place and rotate left the other digits: 68957.
Keep the first two digits in place and rotate the other ones: 68579.
Keep the first three digits and rotate left the rest: 68597.
Now it is over since keeping the first four it remains only one digit which rotated is itself.
You have the following sequence of numbers:
56789 -> 67895 -> 68957 -> 68579 -> 68597
and you must return the greatest: 68957.
Task
Write method maxRot(n) which given a positive integer n returns
the maximum number you got doing rotations similar to the above example.
example:
maxRot(56789) should return 68957
maxRot(3
*/
    public static void main(String[] args) {
        System.out.println("Expected: 68957");
        System.out.println("Actual: " + maxRot(56789));

        System.out.println("Expected: 85821534");
        System.out.println("Actual: " + maxRot(38458215));
    }

    public static int maxRot(int num){
        List<Integer> finalNumbers = new ArrayList<>();
        String numString = Integer.toString(num); //Convert to  a string

        for(int i = 0; i < numString.length(); i++){ //loop through string
            String front = numString.substring(0,i);//front needs to add a digit each time
            String middle = numString.substring(i + 1);//middle need to go from one past i to end
            String end = numString.substring(i, i + 1); //numString ( i, 1); --needs to give us 1 num from front
            int rotate = Integer.parseInt(front + middle + end);
            finalNumbers.add(rotate);
            numString = Integer.toString(rotate);
        }
        return Collections.max(finalNumbers);
    }

}
