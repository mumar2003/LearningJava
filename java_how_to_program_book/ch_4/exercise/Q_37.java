/*
4.37 (Sides of a Right Triangle) Write an application that reads three
nonzero integers and determines and prints whether they could represent
the sides of a right triangle.
 */
package java_how_to_program_book.ch_4.exercise;

import java.util.Scanner;

public class Q_37 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first side");
        int N=input.nextInt();
        System.out.println("Enter the second side");
        int N1=input.nextInt();
        System.out.println("Enter the third side");
        int N2=input.nextInt();
        if((N1+N2+N)==180){
            if(N1==90 || N2==90 || N==90){
            System.out.println("this is a right angle  triangle");
        }else System.out.println("this is a triangle but not a right angle triangle");
        }else
            System.out.println("this is not a triangle");
    }
}
