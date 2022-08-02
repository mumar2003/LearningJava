/*
6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to
park for up to three hours. The garage charges an additional $0.50 per hour
for each hour or part thereof in excess of three hours. The maximum
charge for any given 24-hour period is $10.00. Assume that no car parks
for longer than 24 hours at a time. Write an application that calculates and
displays the parking charges for each customer who parked in the garage
yesterday. You should enter the hours parked for each customer. The
program should display the charge for the current customer and should
calculate and display the running total of yesterday’s receipts. It should
use the method calculateCharges to determine the charge for each
customer.
 */
package java_how_to_program_book.ch_6;

import java.util.Scanner;

public class Q_8 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many hour you car park");
        int hour = input.nextInt();
        System.out.printf("your charges is = %f",calculateCharges(hour));
    }

    public static double calculateCharges(int hours) {
        double rate = 0, remainHours;
        if (hours <= 3) {
            rate = 2;
        } else if (hours == 24) {
            rate = 10;
        } else if (hours < 24) {
            remainHours=hours-3;
            rate=2;
            int i=1;
            while(rate!=10 && i<=remainHours){
                rate=rate+1*0.5;
                i++;
            }
                    } else
            System.out.println("you can park maximum 24 hour");
        return rate;
    }
}
