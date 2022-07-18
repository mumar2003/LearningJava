package java_how_to_program_book.ch_2;
import java.util.Scanner;
public class Q2_24 {
    public static void main(String [] args){
       /* 2.24 (Largest and Smallest Integers) Write an application that reads five
        integers and determines and prints the largest and smallest integers in the
        group. Use only the programming techniques you learned in this chapter.*/
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
        int largestNumber=0;
        if( a>b && a>c && a>d && a>e)
            largestNumber=a;
        else if(b>a && b>c && b>d && b>e)
            largestNumber=b;
        else if (c>a && c>b && c>d && c>e)
            largestNumber=c;
        else if(d>a && d>b && d>c && d>e)
            largestNumber=d;
        else if(e>a && e>b && e>c && e>d)
            largestNumber=e;
        else
            System.out.println("number is equal");
        int smallestNumber=0;
        if( a<b && a<c && a<d && a<e)
            smallestNumber=a;
        else if(b<a && b<c && b<d && b<e)
            smallestNumber=b;
        else if (c<a && c<b && c<d && c<e)
            smallestNumber=c;
        else if(d<a && d<b && d<c && d<e)
            smallestNumber=d;
        else if(e<a && e<b && e<c && e<d)
            smallestNumber=e;
        else
            System.out.println("number is equal");
        System.out.println("your smallest number is "+smallestNumber);
        System.out.println("your largest number is "+largestNumber);

        }


    }

