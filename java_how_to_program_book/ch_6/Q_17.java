
/*
6.17 (Even or Odd) Write a method isEven that uses the remainder
operator (%) to determine whether an integer is even. The method should
take an integer argument and return true if the integer is even and
false otherwise. Incorporate this method into an application that inputs
a sequence of integers (one at a time) and determines whether each is even
or odd.
 */
package java_how_to_program_book.ch_6;

import java.util.Scanner;

public class Q_17 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("for linux/UNIX/Mac enter Ctrl+d for ending checking even or not\n" +
                "for window press Ctrl+z  ");
        System.out.println("\n Please Enter the Number");
        while (input.hasNext()) {
            int N1=input.nextInt();
            if(isEven(N1)){
                System.out.println(N1+" is even");
            }else System.out.println(N1+" is odd");
        }
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
}
