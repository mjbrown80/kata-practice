package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        File file = new File("input1.txt");
        try {
            Scanner inputFile = new Scanner(file);
            List<Integer> list = new ArrayList<>();
            while (inputFile.hasNext()) {
                //how to determine which two numbers (line) add up to 2020
                list.add(inputFile.nextInt());
            }

            //list of numbers
            int num1 = 0;
            int num2 = 0;

            for (int i = 0; i < list.size(); i++){//create a loop
                num1 = list.get(i);
                for (int j = i + 1; j < list.size(); j++){
                    num2 = list.get(j);
                    if ((num1 + num2) == 2020){
                        System.out.println(num1 + " " + num2);
                        System.out.println((num1 * num2));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
