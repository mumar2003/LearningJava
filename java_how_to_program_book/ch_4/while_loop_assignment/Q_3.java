//3. Write a program that reads two numbers find and display their GCD (Greatest Common Divisor)?
package java_how_to_program_book.ch_4.while_loop_assignment;
import java.util.Scanner;
public class Q_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the first Number");
        int N1 = input.nextInt();
        System.out.println("Please Enter the second Number");
        int N2 = input.nextInt();
       // if (N1 % 2 == 0 && N2 % 2 == 0) {
            int GCD = 0;
            int N3;
            if (N1 >= N2) {
                N3 = N1;
            } else {
                N3 = N2;
            }
            int i = 2;
            while (i < N3 / 2) {
                if (N1 % i == 0 && N2 % i == 0) {
                    GCD = i;
                    //System.out.println("GCD = "+i);
                }
                i++;
            }
            System.out.println("GCD is =" + GCD);
       // }else{
          //  System.out.println("your numbers is not a even Number");

    }
}