/*
6.21 (Separating Digits)Write methods that accomplish each of the
following tasks:1. Calculate the integer part of the quotient when integer a is
divided by integer b.
2. Calculate the integer remainder when integer a is divided by
integer b.
3. Use the methods developed in parts (a) and (b) to write a method
displayDigits that receives an integer between 1 and
99999 and displays it as a sequence of digits, separating each
pair of digits by two spaces. For example, the integer 4562
should appear as
4 5 6 2
Incorporate the methods into an application that inputs an integer
and calls displayDigits by passing the method the integer
entered. Display the results.
 */
package java_how_to_program_book.ch_6;

import java.util.Scanner;

public class Q_21 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //1. Calculate the integer part of the quotient when integer a is
        //divided by integer b.
        System.out.println("Enter the first number");
        int a= input.nextInt();
        System.out.println("Enter the second number");
        int b= input.nextInt();
        System.out.println("your integer part of your quotient is = "+quotient(a,b));
        //Calculate the integer remainder when integer a is divided by
        //integer b.
        System.out.println("your remainder is ="+remainder(a,b));
        /*
        3. Use the methods developed in parts (a) and (b) to write a method
           displayDigits that receives an integer between 1 and
           99999 and displays it as a sequence of digits, separating each
           pair of digits by two spaces. For example, the integer 4562
           should appear as
           4 5 6 2
           Incorporate the methods into an application that inputs an integer
           and calls displayDigits by passing the method the integer
           entered. Display the results.
         */
        System.out.println("Enter the number between 1 to 99999");
        int N1, N2=0;
        do {
            N1 = input.nextInt();
            if (N1 > 0 && N1 < 10) {
                N2 = 1;
            } else if (N1 < 100) {
                N2 = 10;
            } else if (N1 < 1000) {
                N2 = 100;
            } else if (N1 < 10000) {
                N2 = 1000;
            } else if (N1 < 100000) {
                N2 = 10000;
            } else System.out.println("you enter invalid number please Enter the number between 1 and 99999");
        } while (N1 < 0 || N1 > 100000);
        displayDigit(N1, N2);
    }

    public static void displayDigit(int x,int y) {
        int z;
        while(x>0){
            z=x/y;
            x=x%y;
            y=y/10;
            System.out.printf(" "+z);
        }

        }
        public static int quotient(int a,int b){
        return a/b;
        }
        public static int remainder(int a,int b){
        return a%b;
        }
    }
