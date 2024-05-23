package org.example;

import java.util.Arrays;
import java.util.List;

public class TicketPrice {

    /*

Problem:
You are building a ticket booking system for a cinema.
The system needs to calculate the ticket price based on the following criteria:

Children (age 0-12): $5 per ticket
Teenagers (age 13-17): $8 per ticket
Adults (age 18-64): $12 per ticket
Seniors (age 65+): $10 per ticket
Additionally, there are some special conditions:

If a group of 5 or more people books tickets together, they are eligible for a 10% discount on the total price.
On weekends (Saturday and Sunday), there is a 5% surcharge on the ticket price for adults and seniors.
Your task is to implement a function called calculateTicketPrice that takes a List of the ages of each person
 and a variable that is true if it is the weekend and returns the total price for the tickets

*/

    public static void main(String[] args) {
        List<Integer> ages1 = Arrays.asList(new Integer[]{8, 15, 25, 70});
        System.out.println("Expected: 35.0 - Actual: " + calculateTicketPrice(ages1, false)); // Output: 35

        List<Integer> ages2 = Arrays.asList(new Integer[]{45, 50, 60});
        System.out.println("Expected: 37.80 - Actual: " +calculateTicketPrice(ages2, true)); // Output: 37.80

        List<Integer> ages3 = Arrays.asList(new Integer[]{12, 12, 12, 12, 12});
        System.out.println("Expected: 22.5 - Actual: " +calculateTicketPrice(ages3, false)); // Output: 22.5
    }

    public static Double calculateTicketPrice(List<Integer> ages, boolean isWeekend){

        double priceTicket = 0;



        for (int age : ages){
            double weekendCharge = (priceTicket * 0.05);
            if (age <= 12 && isWeekend){
                priceTicket += 5;
                priceTicket += weekendCharge;
            } else if (age <= 12 ) {
                priceTicket += 5;
            }
            if (age >= 13 && age <= 17 && isWeekend) {
                priceTicket +=8;
                priceTicket += weekendCharge;
            } else if (age >= 13 && age <= 17) {
                priceTicket += 8;
            }
            if (age >= 18 && age <= 64 && isWeekend) {
                priceTicket += 12;
                priceTicket += weekendCharge;
            } else if (age >= 18 && age <= 64) {
                priceTicket += 12;
            }
            if (age >= 65 && isWeekend){
                priceTicket += 10;
                priceTicket += weekendCharge;
            } else if (age >= 65) {
                priceTicket +=10;
            }
    }
        if (ages.size() >= 5) {
            double groupDiscount = priceTicket * 0.1;
            priceTicket -=groupDiscount;
        }
        return priceTicket;
    }
}
