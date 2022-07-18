/*
2.17 (Arithmetic, Smallest and Largest) Write an application that inputs
three integers from the user and displays the sum, average, product,
smallest and largest of the numbers. Use the techniques shown in Fig. 2.15
. [Note: The calculation of the average in this exercise should result in an
integer representation of the average. So, if the sum of the values is 7, the
average should be 2, not 2.3333….]
 */
package java_how_to_program_book.ch_2;
import java.util.Scanner;
public class Q2_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    /*
    2.17 (Arithmetic, Smallest and Largest) Write an application that inputs
three integers from the user and displays the sum, average, product,
smallest and largest of the numbers.
     */
        System.out.println("Enter your first number");
        int firstNumber=input.nextInt();
        System.out.println("Enter your second number");
        int secondNumber=input.nextInt();
        System.out.println("Enter your third number");
        int thirdNumber=input.nextInt();
        int sum=firstNumber+secondNumber+thirdNumber;
        System.out.println("sum of three number is"+sum);
        int average=(firstNumber+secondNumber+thirdNumber)/3;
        System.out.println("your average is "+average);
        int product=(firstNumber*secondNumber*thirdNumber);
        System.out.println("your product is "+product);
        //for find  largestNumber
        int largestNumber=0;
        if(firstNumber>secondNumber && firstNumber>thirdNumber)
            largestNumber=firstNumber;
        else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            largestNumber=secondNumber;}
        else if(thirdNumber>firstNumber && thirdNumber>secondNumber)
           largestNumber=thirdNumber;
        //for smallestNumber
        int smallestNumber=0;
        if(firstNumber<secondNumber && firstNumber<thirdNumber)
            smallestNumber=firstNumber;
        else if (secondNumber<firstNumber && secondNumber<thirdNumber) {
            smallestNumber=secondNumber;}
        else if(thirdNumber>firstNumber && thirdNumber>secondNumber)
            smallestNumber=thirdNumber;

        System.out.printf("your smaller number is %d and your largest number is %d",smallestNumber,largestNumber);
    }


    }

