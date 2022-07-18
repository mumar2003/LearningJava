// 2.8 Write Java statements that accomplish each of the following tasks:
package java_how_to_program_book.ch_2;
import java.util.Scanner;
public class Q2_8 {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
        //1. Display the message "Enter an integer: ", leaving the cursor on the same line.

        System.out.print("Enter an integer: ");


       // 2. Assign the product of variables b and c to the int variable a.
        int a,b,c;
        System.out.print("Enter the value of a: ");
        a=input.nextInt();
        System.out.print("Enter the value of b: ");
        b=input.nextInt();
        c=a*b;
        System.out.println("product of variable a and b is: "+c);

       // 3. Use a comment to state that a program performs a sample payroll calculation.
        System.out.println("a program performs a sample payroll calculation.");

    }
}
