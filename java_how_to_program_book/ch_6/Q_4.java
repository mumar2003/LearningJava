/*
6.4 Give the method header for each of the following methods:
1. Method hypotenuse, which takes two double-precision,
floating-point arguments side1 and side2 and returns a
double-precision, floating-point result.
2. Method smallest, which takes three integers x, y and z and
returns an integer.
3. Method instructions, which does not take any arguments
and does not return a value. [Note: Such methods are commonly
used to display instructions to a user.]
4. Method intToFloat, which takes integer argument number
and returns a float.
 */
package java_how_to_program_book.ch_6;
import java.lang.Math;
import java.util.Scanner;
public class Q_4 {
    public static final Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        /*
        1. Method hypotenuse, which takes two double-precision,
           floating-point arguments side1 and side2 and returns a
           double-precision, floating-point result.
         */
        System.out.println("Please Enter the 1st side ");
        int N1=input.nextInt();
        System.out.println("Please Enter the 2nd side ");
        int N2=input.nextInt();
        System.out.println("your hypotenuse side is =" +triangleHypotenuse(N1,N2));
        /*
        2.
        Method smallest, which takes three integers x, y and z and
        returns an integer.
         */
        System.out.println("please Enter X number");
        int x=input.nextInt();
        System.out.println("please Enter Y number");
        int y=input.nextInt();
        System.out.println("please Enter Z number");
        int z=input.nextInt();
        System.out.println("Your smallest number is = "+smallest(x,y,z));

        /*
        3. Method instructions, which does not take any arguments
           and does not return a value. [Note: Such methods are commonly
           used to display instructions to a user.]
         */
        print();

        /*
        4. Method intToFloat, which takes integer argument number
           and returns a float.
         */
        System.out.println("please enter the integer number that you want to convert in float");
        int N3=input.nextInt();
        System.out.println(intToFloat(N3));
    }
    public static float intToFloat(int x){
        return (float) x;
    }

    public static void print(){
        System.out.println("you are legend student,so you will become a good programmer");
    }
    public static int smallest(int x,int y,int z){
        int small=0;
        if(x<y && x<z){
             small=x;
        }else if(y<x &&y<z)
            small=y;
        else
            small=z;
        return small;
    }
    public static float triangleHypotenuse(float x,float y){
        double hypotenuseSquare=x*x+y*y;
        return (float) Math.sqrt(hypotenuseSquare);
    }
}
