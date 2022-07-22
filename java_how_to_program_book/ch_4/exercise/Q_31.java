/*
4.31 (Palindromes) A palindrome is a sequence of characters that reads
the same backward as forward. For example, each of the following five-
digit integers is a palindrome: 12321, 55555, 45554 and 11611. Write an
application that reads in a five-digit integer and determines whether it’s a
palindrome. If the number is not five digits long, display an error message
and allow the user to enter a new value.
 */
package java_how_to_program_book.ch_4.exercise;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class Q_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 digit number for check palindrome number");
        int N = input.nextInt();
        if(N/10000==N%10 && N/1000%10==N/10%10){
            System.out.println("Number is a palindrome");
        }
    }
}