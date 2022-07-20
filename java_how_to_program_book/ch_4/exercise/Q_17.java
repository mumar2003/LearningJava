/*4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get.
One driver has kept track of several trips by recording the miles driven and
gallons used for each tankful.Develop a Java application
that will input the miles driven and gallons used (both as integers) for each
trip. The program should calculate and display the miles per gallon
obtained for each trip and print the combined miles per gallon obtained for
all trips up to this point. All averaging calculations should produce
floating-point results. Use class Scanner and sentinel-controlled
iteration to obtain the data from the user.*/
package java_how_to_program_book.ch_4.exercise;

import java.util.Scanner;

public class Q_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles_driven, gallon,i=0;
        float MPG;
        float Combine_MPG_each_trip=0;
        int exit = 0;
        while (exit != 1) {
            i++;
            System.out.println("Enter the miles that you driven in "+i+" trip");
            miles_driven = input.nextInt();
            System.out.println("Enter the gallon that you used in "+ i +" trip");
            gallon = input.nextInt();
            MPG = miles_driven / gallon;
            Combine_MPG_each_trip=(Combine_MPG_each_trip+ MPG);
            System.out.println("Enter 1 for check your automobile average otherwise press another number");
            exit=input.nextInt();

        }
        Combine_MPG_each_trip=Combine_MPG_each_trip/i;
        System.out.println("Average of miles per gallon is :"+Combine_MPG_each_trip);
    }
}
