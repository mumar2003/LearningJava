/*2.32 (Negative, Positive and Zero Values) Write a program that inputs
five numbers and determines and prints the number of negative numbers
input, the number of positive numbers input and the number of zerosinput.*/

package java_how_to_program_book.ch_2;
import java.util.Scanner;
public class Q2_32 {
    public static void main(String[] args){
     Scanner input=new Scanner(System.in);
        System.out.println("Enter your first number");
     int a=input.nextInt();
        System.out.println("Enter your second number");
     int b=input.nextInt();
        System.out.println("Enter your third number");
     int c=input.nextInt();
        System.out.println("Enter your fourth number");
     int d=input.nextInt();
        System.out.println("Enter your fifth number");
     int e=input.nextInt();

     int negative;
     if(a==0)
         System.out.printf("1st number %d is zero %n",a);
     else if(a>0)
         System.out.printf("1st number %d is positive %n",a);
         else if (a<0)
         System.out.printf("1st number %d is negative %n",a);

         //for b
     if(b==0)
         System.out.printf("2nd number %d is zero %n",b);
        else if(b>0)
            System.out.printf("2nd number %d is positive %n",b);
        else if (b<0)
            System.out.printf("2nd number %d is negative %n",b);
        //for c
     if(c==0)
         System.out.printf("3rd number %d is zero %n",c);
        else if(c>0)
            System.out.printf("3rd number %d is positive %n",c);
        else if (c<0)
            System.out.printf("3rd number %d is negative %n",c);
        //for d
     if(d==0)
         System.out.printf("4th number %d is negative %n",d);
        else if(d>0)
            System.out.printf("4th number %d is positive %n",d);
        else if (d<0)
            System.out.printf("4th number %d is negative %n",d);
        //for e
     if(e==0)
         System.out.printf("5th number %d is negative %n",e);
        else if(e>0)
            System.out.printf("5th number %d is positive %n",e);
        else if (e<0)
            System.out.printf("5th number %d is negative %n",e);

    }
}
