package org.example;


import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeMath {
    /*
Given two times in hours, minutes, and seconds (ie '15:04:24'), add or subtract them.
This is a 24 hour clock.
Output should be two digits for all numbers: hours, minutes, seconds (ie '04:02:09').
Name the method timeMath

timeMath('01:24:31', '+', '02:16:05') === '03:40:36'

timeMath('01:24:31', '-', '02:31:41') === '22:52:50'
*/
    public static void main(String[] args) {
        System.out.println("00:00:00 - "  + TimeMath.timeMath("11:24:31", "-", "11:24:31"));
        System.out.println("08:09:03 - "+ TimeMath.timeMath("11:24:31", "-", "03:15:28"));
        System.out.println("03:40:36 - "+ TimeMath.timeMath("01:24:31", "+", "02:16:05"));
        System.out.println("23:59:59 - "+ TimeMath.timeMath("01:24:31", "+", "22:35:28"));
        System.out.println("23:59:59 - "+ TimeMath.timeMath("01:04:31", "-", "01:04:32"));
        System.out.println("00:00:00 - "+ TimeMath.timeMath("01:04:31", "-", "01:04:31"));
        System.out.println("00:00:00 - "+ TimeMath.timeMath("23:59:59", "+", "00:00:01"));
    }


    public static String timeMath(String time1, String operator, String time2) {

        LocalTime time1Str = LocalTime.parse(time1);
        LocalTime time2Str = LocalTime.parse(time2);

        Duration time2Duration = Duration.between(LocalTime.MIN, time2Str);
        LocalTime result = time1Str;

        if (operator.equals("+")) {
            result = result.plus(time2Duration);
        } else if (operator.equals("-")) {
            result = result.minus(time2Duration);
        }

        return result.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

//        //break apart time1 into hr1, min1, and sec1
//        String[] time1Str = time1.split(":");
//        int hr1 = Integer.parseInt(time1Str[0]);
//        int min1 = Integer.parseInt(time1Str[1]);
//        int sec1 = Integer.parseInt(time1Str[2]);
//        //break apart time2 into hr2, min2, and sec2
//        String[] time2Str = time2.split(":");
//        int hr2 = Integer.parseInt(time2Str[0]);
//        int min2 = Integer.parseInt(time2Str[1]);
//        int sec2 = Integer.parseInt(time2Str[2]);
//        int totalHr = 0;
//        int totalMin = 0;
//        int totalSec = 0;
//        //check if operator is "+", then we add
//        if (operator.equals("+")){
//            totalHr = hr1 + hr2;
//            totalMin = min1 + min2;
//            totalSec = sec1 + sec2;
//        }
//        //add hrs together, mins together, and secs together
//        //else (operator is "-"), so subtract
//        else {
//                totalHr = hr1 - hr2;
//                totalMin = min1 - min2;
//                totalSec = sec1 - sec2;
//        }
//        //subtract hrs, then mins, then seconds
//        //then check to see if >= 60 in seconds
//        if (totalSec >=60){
//            //subtract 60 from seconds, and add 1 to minutes
//            totalSec -= 60;
//            totalMin++;
//        }
//
//        //check to see if >= 60 in minutes
//        if (totalMin >= 60){
//            //subtract 60 in minutes, and add 1 to hours
//            totalMin -= 60;
//            totalHr++;
//        }
//
//        //check to see if > 24 in hours
//        //subtract 24 in hours
//        totalHr %= 24;
//        //check to see if hrs < 0
//
//        //check to see if seconds < 0
//        if (totalSec < 0){
//            //set seconds = 60 + seconds
//            totalSec += 60;
//            //subtract one from minutes
//            totalMin--;
//        }
//        //check to see if minutes < 0
//        if (totalMin < 0){
//            //set minutes = 60 + minutes
//            totalMin += 60;
//            //subtract one from hrs
//            totalHr--;
//        }
//        if (totalHr < 0){
//            //set hours = 24 + hours (which are negative)
//            totalHr += 24;
//        }
//
//
//        return padNumber(totalHr) + ":" + padNumber(totalMin) + ":" + padNumber(totalSec);
//    }
//
//    public static String padNumber(int num){
//        String totalNum = num + "";
//        if (totalNum.length() ==1){
//            totalNum = "0" + totalNum;
//        }
//        return totalNum;
//    }

}
