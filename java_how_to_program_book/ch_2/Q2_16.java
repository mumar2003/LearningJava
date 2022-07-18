/*2.16 (Comparing Integers) Write an application that asks the user to enter
        two integers, obtains them from the user and displays the larger number
        followed by the words "is larger". If the numbers are equal, print the
        message "These numbers are equal".*/
package java_how_to_program_book.ch_2;
import java.util.Scanner;
public class Q2_16 {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
        System.out.println("Enter your first number that you compare");
        int a=input.nextInt();
        System.out.println("Enter your second number that you want to compare");
        int b=input.nextInt();
        if(a>b){
            System.out.printf("first number %d is greater than your second number %d%n",a,b);}
        else if(b>a)
            System.out.printf("second number %d is greater than your first number %d%n",b,a);
        else
            System.out.println("these number are equal");
        }
    }

