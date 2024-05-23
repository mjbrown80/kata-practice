package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {

    // Given a file of integers, find the 2 entries that sum to 2020.
    //multiply those numbers together and return the product
    //example input file:
    //1721 979 366 299 675 1456
    //output:
    //514579
    // the two entries that sum to 2020 are 1721 and 299.
    //multiplying them together produces 514579

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input1.txt");
        try {
            Scanner inputFile = new Scanner(file);
            List<Integer> list = new ArrayList<>();
            while(inputFile.hasNext()){
                list.add(inputFile.nextInt());
            }

            int num1 = 0;
            int num2 = 0;

            for (int i = 0; i < list.size(); i++){
                num1 = list.get(i);
                for (int j = i + 1; j < list.size(); j++){
                    num2 = list.get(j);
                    if ((num1 + num2) == 2020){
                        System.out.println(num1 + " " + num2);
                        System.out.println(num1 * num2);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
