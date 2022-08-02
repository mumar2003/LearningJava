/*
6.15 (Hypotenuse Calculations) Define a method hypotenuse thatcalculates the hypotenuse of a right triangle when the lengths of the other
two sides are given. The method should take two arguments of type
double and return the hypotenuse as a double. Incorporate this method
into an application that reads values for side1 and side2 and performs
the calculation with the hypotenuse method. Use Math methods pow
and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.14 . [Note:Class Math also provides method hypot to
perform this calculation.]
 */
package java_how_to_program_book.ch_6;
import java.util.Scanner;
import java.lang.Math;
public class Q_15 {
    public static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the length of first side");
        double side1=input.nextDouble();
        System.out.println("Enter the length of second side");
        double side2=input.nextDouble();
        System.out.println("your hypotenuse length is = "+hypotenuse(side1,side2));
    }
    public static double hypotenuse(double x,double y){
        double z=Math.pow(x,2)+Math.pow(y,2);
        return Math.sqrt(z);
    }
}
