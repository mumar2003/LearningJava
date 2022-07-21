/*
4.30 (Square of Asterisks) Write an application that prompts the user to
enter the size of the side of a square, then displays a hollow square of that
size made of asterisks. Your program should work for squares of all side
lengths between 1 and 20.
 */
package java_how_to_program_book.ch_4.exercise;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Q_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of square, size length must be between 1 to 20");
        int sizeOfSquare = input.nextInt(), i = 1, j = 1;
        while (i <= sizeOfSquare) {
            j = 1;
            while (j <= sizeOfSquare) {
                if (i == 1 || i == sizeOfSquare || j == 1 || j == sizeOfSquare)
                    System.out.printf("*");
                else {
                    System.out.printf(" ");
                }
                j++;
            }
                System.out.println();
                i++;
            }
        }
    }

