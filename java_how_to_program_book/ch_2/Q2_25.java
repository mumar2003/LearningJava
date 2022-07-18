package java_how_to_program_book.ch_2;
import java.util.Scanner;
public class Q2_25 {
    public static void main(String[] args){
        /*2.25 (Odd or Even) Write an application that reads an integer and
        determines and prints whether it’s odd or even. [Hint: Use the remainder
        operator. An even number is a multiple of 2. Any multiple of 2 leaves a
        remainder of 0 when divided by 2.]*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=input.nextInt();

        if(a%2==0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");

    }
}
