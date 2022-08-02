/*
6.10 (Rounding Numbers) To round numbers to specific decimal places,
use a statement like
double y = Math.floor(x * 10 + 0.5) / 10;
which rounds x to the tenths position (i.e., the first position to the right of
the decimal point), or
double y = Math.floor(x * 100 + 0.5) / 100;
which rounds x to the hundredths position (i.e., the second position to the
right of the decimal point). Write an application that defines four methods
for rounding a number x in various ways:
1. roundToInteger(number)
2. roundToTenths(number)
3. roundToHundredths(number)
4. roundToThousandths(number)
For each value read, your program should display the original value, the
number rounded to the nearest integer, the number rounded to the nearest
tenth, the number rounded to the nearest hundredth and the number
rounded to the nearest thousandth.
 */
package java_how_to_program_book.ch_6;

import java.util.Scanner;
import java.lang.Math;

public class Q_10 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a decimal number that you want to nearest roundOff");
        double x = input.nextDouble();
        double y = roundOffNumber(x);
        System.out.println(y);
        System.out.printf("you Enter %f and its roundOff number is %f %n", x, y);
        System.out.println("Enter a decimal number that you want to nearest roundOff tens");
        double a= input.nextDouble();
        double z=roundOffTens(a);
        System.out.printf("you Enter %f and its roundOff tens is %f %n", a, z);
        System.out.println("Enter a decimal number that you want to nearest roundOff hundred");
        double b= input.nextDouble();
         double c=roundOffHundred(b);
        System.out.printf("you Enter %f and its roundOff hundred is %f%n ", b, c);
        System.out.println("Enter a decimal number that you want to nearest roundOff thousand");
        double d=input.nextDouble();
        double e=roundOffThousand(d);
        System.out.printf("you Enter %f and its roundOff thousand is %f%n ", d, e);

    }

    public static double roundOffNumber(double x) {
        System.out.println(x);
        double y = Math.floor(x + 0.5);
        return  y;
    }

    public static double roundOffTens(double x) {
        System.out.println(x);
        double y = Math.floor(x*10 + 0.5)/10;
        return  y;
    }

    public static double roundOffHundred(double x) {
        System.out.println(x);
        double y = Math.floor(x*100 + 0.5)/100;

        return  y;
    }

    public static double roundOffThousand(double x) {
        System.out.println(x);
        double y = Math.floor(x*1000 + 0.5)/1000;
        return  y;
    }
}

