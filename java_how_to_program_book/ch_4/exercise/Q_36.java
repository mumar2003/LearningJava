/*
4.36 (Sides of a Triangle) Write an application that reads three nonzero
values entered by the user and determines and prints whether they could
represent the sides of a triangle.
 */
package java_how_to_program_book.ch_4.exercise;
import java.util.Scanner;
public class Q_36 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the angle of first side");
        int N1=input.nextInt();
        System.out.println("Enter the angle of second side");
        int N2=input.nextInt();
        System.out.println("Enter the angle of third side");
        int N3=input.nextInt();
        if((N1+N2+N3)==180){
            System.out.println("this is a triangle");
        }else
            System.out.println("this is not a triangle");
    }
}
