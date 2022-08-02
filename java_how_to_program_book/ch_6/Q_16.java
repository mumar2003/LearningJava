/*
6.16 (Multiples) Write a method isMultiple that determines, for a pair
of integers, whether the second integer is a multiple of the first. The
method should take two integer arguments and return true if the second
is a multiple of the first and false otherwise. [Hint: Use the remainder
operator.] Incorporate this method into an application that inputs a series
of pairs of integers (one pair at a time) and determines whether the second
value in each pair is a multiple of the first.
 */
package java_how_to_program_book.ch_6;
import java.util.Scanner;
public class Q_16 {
    public static  Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the first Number");
        int N1=input.nextInt();
        System.out.println("Enter the second Number");
        int N2=input.nextInt();
        boolean y=inmultiple(N1,N2);
              if(y){
                  System.out.println("second number is the multiple of first");
              }else System.out.println("the second number is not the multiple of first");
    }

    public static boolean inmultiple(int x, int y) {
        return y % x == 0;
    }
}
