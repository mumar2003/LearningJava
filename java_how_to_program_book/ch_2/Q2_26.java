package java_how_to_program_book.ch_2;
import java.util.Scanner;
public class Q2_26 {
    public static void main(String[] args){
    /*2.26 (Multiples) Write an application that reads two integers, determines
    whether the first is a multiple of the second and prints the result. [Hint:
    Use the remainder operator.]*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first number");
        int a=input.nextInt();
        System.out.println("Enter your second number");
        int b=input.nextInt();
        if(b%a==0)
            System.out.printf("your first number %d is multiplier by  the second number %d",a,b);

         else
            System.out.println("your first number is not the multiplier of second");

    }

}
