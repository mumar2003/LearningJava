/*
6.9 (Rounding Numbers) Math.floor can be used to round values to
the nearest integer—e.g.,
double y = Math.floor(x + 0.5);will round the number x to the nearest integer and assign the result to y.
Write an application that reads double values and uses the preceding
statement to round each of the numbers to the nearest integer. For each
number processed, display both the original number and the rounded
number.
 */
package java_how_to_program_book.ch_6;
import java.util.Scanner;
import java.lang.Math;
public class Q_9 {
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a decimal number that you want to nearest roundOff");
        double x=input.nextDouble();
        int y=roundOff(x);
        System.out.println(y);
        System.out.printf("you Enter %d and its roundOff number is %d ",x,y);
    }
    public static int  roundOff(double x){
        System.out.println(x);
         double y=Math.floor(x+0.5);
        return (int) y;
    }
}
