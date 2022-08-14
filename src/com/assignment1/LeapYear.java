package com.assignment1;

public class LeapYear {

    public static void main(String[] args) {

        // year to be checked
        int year = 2400;
        boolean leap = false;

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0){
                    leap = true;
                    System.out.println("It is leap year");
                }
                else {
                    leap = false;
                    System.out.println("It isn't leap year");
                }
            }

            // if the year is not century
            else {
                leap = true;
                System.out.println("It is leap year");
            }
        }

    }
}
