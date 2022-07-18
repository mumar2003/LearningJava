//6. Write a program that reads unsigned numbers in the range 10-60000 continually until zero is entered.
//  Find and display how many numbers are completely divisible by 9, odd and even. Use while loop statement?
package java_how_to_program_book.ch_4.while_loop_assignment;
import java.util.Scanner;
public class Q_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int N1 = input.nextInt();
        int counter = 0;
        int even = 0;
        int odd = 0;
        while (N1 != 0) {
            if(N1==0){
                break;

            }else{

            if (N1 >= 10 && N1 <= 60000 && N1 != 0) {
                if (N1 % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                if (N1 % 9 == 0) {
                    counter++;
                }

            }
            N1=input.nextInt();}}
            System.out.println("divide number by 9 = "+counter);
            System.out.println("even number is ="+even+"odd number is ="+odd);


        System.out.println("outside the while loop");
    }
}