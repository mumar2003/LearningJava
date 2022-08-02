/*
6.14 (Exponentiation) Write a method integerPower(base,
exponent) that returns the value of
base
exponent
4 For example, integerPower(3, 4) calculates 3 (or 3 * 3 * 3 * 3).
Assume that exponent is a positive, nonzero integer and that base is an
integer. Use a for or while statement to control the calculation. Do not
use any Math class methods. Incorporate this method into an application
that reads integer values for base and exponent and performs the
calculation with the integerPower method.
 */
package java_how_to_program_book.ch_6;
import java.util.Scanner;
public class Q_14 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the base of your number");
        int base=input.nextInt();
        System.out.println("Enter the exponent  of your number ");
        int exponent=input.nextInt();
        System.out.println("your integerPower is = "+integerPower(base,exponent));
    }

    public static double integerPower(int n, int n2) {

        double N1 = n;
        for (int i = 1; i < n2; i++) {
        N1=N1*n;
        }
        return N1;
    }
}
