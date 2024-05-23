package org.example;

import java.util.*;

public class DataStructures {

    public static void main(String[] args) {
        System.out.println("How many integers?" );
        Scanner scanner = new Scanner(System.in);
        int howMany = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[howMany];
        System.out.println("This array will hold " + numbers.length + " elements");

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter a number: ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
            System.out.print("The Array holds: " + numbers);

            for (int n: numbers){
                System.out.println(n);
            }

            //largest Number?
            int max = numbers[0];
            int min = numbers[0];
            for (int n : numbers){
                if (max < n){
                    max = n;
                }else if (min > n){
                    min = n;
                }
            }
        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);

        //average
        int sum = 0;
        for (int n : numbers){
            sum += n;
        }
        double  average = sum / numbers.length;
        System.out.println("The average is " + average);
        //bubble sort

        for (int i = 0; i < numbers.length; i ++) {
            for (int j = 0; j < numbers.length - 1; j++){
                if (numbers[j] > numbers[j + 1]){
                    //swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int n : numbers){
            System.out.println(n);
        }

        List<String> myList = new ArrayList<>();
        myList.add("matt");
        myList.add("kait");
        myList.add("emme");
        myList.add("millie");

        System.out.println(myList);
        Collections.sort(myList);//sort alphabetically
        System.out.println(myList);

        System.out.println("The largest value is " + Collections.max(myList));

        Map<String, Integer> myMap = new HashMap<>(); //names and counts of names
        boolean isDone = false;
        while (!isDone){
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();
            if (myMap.containsKey(name)){
                int value = myMap.get(name);
                value++;
                myMap.put(name,value);
            }else {
                myMap.put(name, 1);
            }
            System.out.print("Enter more? y or n");
            if (scanner.nextLine().equalsIgnoreCase("n")){
                isDone = true;
            }
        }
        System.out.println(myMap);
    }
}
