/*
6.18 (Displaying a Square of Asterisks)Write a method
squareOfAsterisks that displays a solid square (the same number of rows and columns)
of asterisks whose side is specified in integer
parameter side. For example, if side is 4, the method should display
****
****
****
****
Incorporate this method into an application that reads an integer value for
side from the user and outputs the asterisks with the
squareOfAsterisks method.
 */
package java_how_to_program_book.ch_6;

import java.util.Scanner;

public class Q_18 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please Enter the Number That you want to Square of Asterisks");
        int N1 = input.nextInt();
        squareOfAsterisks(N1);
    }

    public static void squareOfAsterisks(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
