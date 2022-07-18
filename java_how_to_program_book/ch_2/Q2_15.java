//2.15 (Arithmetic) Write an application that asks the user to enter two
//integers, obtains them from the user and prints their sum, product,
//difference and quotient (division).
package java_how_to_program_book.ch_2;
import java.util.Scanner;

public class Q2_15 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int number1;
        int number2;
        System.out.println("enter the first number");;
        number1=input.nextInt();
        System.out.println("enter the second number");
        number2=input.nextInt();
        //for sum of two numbers
        int sum;
        sum=number1+number2;
        //for subtract of two number
        int subtract;
        subtract=number1-number2;
        //for multiply two number
        int multiply;
        multiply=number1*number2;
        //for division two number
        int division;
        division=number1/number2;
        //for mudulus two number
        int mod;
        mod=number1%number2;
        System.out.printf(" sum is %d%n subtract is %d%n multiply is %d%n division is %d%n " +
                "mod is %d%n ",sum,subtract,multiply,division,mod);

    }
}
