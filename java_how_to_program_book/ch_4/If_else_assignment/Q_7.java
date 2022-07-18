//7. Write a program that reads an integer number from the user (within range 1-100).
// Then it check that whether the number is greater than, less than or equal to 50?
package If_else_assignment;
import java.util.Scanner;
public class Q_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the an integer number from the user (within range 1-100).");
        int number = input.nextInt();
        if (number > 0 && number < 101) {
            if (number == 50) {
                System.out.println("Number is equal to 50");
            } else {
                if (number < 50) {
                    System.out.println("Number is less then 50");
                } else {
                    System.out.println("Number is greater than 50");
                }
            }
        }
    }
}
