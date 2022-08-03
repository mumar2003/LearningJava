/*
6.20 (Circle Area) Write an application that prompts the user for the
radius of a circle and uses a method called circleArea to calculate the
area of the circle.
 */
package java_how_to_program_book.ch_6;

import java.util.Scanner;

public class Q_20 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();
        System.out.println("your circle area ="+circleArea(radius));
    }

    public static double circleArea(double radius) {

        return Math.PI * radius * radius;
    }
}
