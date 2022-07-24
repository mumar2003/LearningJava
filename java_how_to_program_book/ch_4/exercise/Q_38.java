/*
   4.38 .
   (Factorial) The factorial of a nonnegative integer n is written as n!
   (pronounced “n factorial”) and is defined for values of n greater than or
    equal to 1 as:
       n!=n*(n-1)*(n-2)*(n-3)....1
   and for the n value 0 as:
       n!=1
   For example,5!=5*4*3*2*1      which is 120.

1. Write an application that reads a nonnegative integer and
   computes and prints its factorial.

2. Write an application that estimates the value of the mathematical
   constant e by using the following formula. Allow the user to
   enter the number of terms to calculate.
       e^x=(1/1!)+(2/2!)+(3/3!)+......

3. Write an application that computes the value of
   by using the (e^x) following formula. Allow the user to enter the number of terms to
   calculate.
      e^x=(x/1!)+(x^2/2!)+(x^3/3!)+......

 */
package java_how_to_program_book.ch_4.exercise;
import java.math.BigInteger;
import java.util.Scanner;
public class Q_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int n = input.nextInt();
        int factorials = 1;
        int e=1;
        BigInteger factorial = BigInteger.valueOf(1);
        if (n >=1) {
            while (n >= 1) {
                factorial = factorial.multiply(BigInteger.valueOf(n));
                n--;
            }
            System.out.println(factorial);
        } else {
            System.out.println("your number is negative");
        }

   /* 2. Write an application that estimates the value of the mathematical
    constant e by using the following formula. Allow the user to
    enter the number of terms to calculate.
            e=(1/1!)+(2/2!)+(3/3!)+......
    */

        System.out.println("enter the number of terms to calculate");
        int term = input.nextInt();
        while (term >= 0) {
            n = term;
            if (n >=1) {
                while (n >= 1) {
                    factorials = factorials * n;
                    n--;
                }
                System.out.println(factorials);

                e=e+1/factorials;
                System.out.println(e);
                factorials=1;
                term--;

            }
        }
    }
}
