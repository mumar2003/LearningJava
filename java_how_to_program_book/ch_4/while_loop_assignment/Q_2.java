//2. Write a program that reads a five-digit integer and determines whether the number is palindrome?
package java_how_to_program_book.ch_4.while_loop_assignment;
import java.util.Scanner;
public class Q_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the five digit number");
        int N = input.nextInt();
        if (N / 99999 == 0) {
            int R = N % 10;
            int F = N / 10000;
            if (F == R) {
                R = N % 100 / 10;
                F = N / 1000 % 10;
                if (F == R) {

                    System.out.println("The NUmber is Palindrome");
                }
            }
         else {
            System.out.println("The Number is not a Palindrome");}
        }
        else{
            System.out.println("Please Enter the five digit Number");
        }
    }
}
