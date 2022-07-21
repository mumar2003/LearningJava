/*
4.24 (Validating User Input) Modify the program in Fig. 4.12 to validate
its inputs. For any input, if the value entered is other than 1 or 2, keep
looping until the user enters a correct value.
 */
package java_how_to_program_book.ch_4.exercise;

import java.util.Scanner;

public class Q_24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, number;
        System.out.println("Please Enter the Number");
        i=input.nextInt();
        while (i == 1) {
            System.out.println("please enter your code ");
            number = input.nextInt();
            if (number == 1 || number == 2) {
                i = 1;
            } else {
                System.out.println("Only 1 and 2 are eligible for this");
            }

        }
        System.out.println("you are valid  for this account");
    }
}
