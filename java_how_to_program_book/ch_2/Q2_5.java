//state that a program will calculate the product of three integers.
package java_how_to_program_book.ch_2;
import java.util.Scanner;


public class Q2_5 {
    public static void main(String[] args){
        //2.Create a Scanner called input that reads values from the standard input.
         Scanner input=new Scanner(System.in);

         //3. Prompt the user to enter the first integer
        System.out.print("Enter your first number : ");

        // 4. Read the first integer from the user and store it in the in variable x.
        int X;
        X=input.nextInt();

        //5. Prompt the user to enter the second integer.
        System.out.print("Enter your second number : ");

        //6. Read the second integer from the user and store it in the in variable y.
        int Y;
        Y=input.nextInt();

        // 7. Prompt the user to enter the third integer.
        System.out.print("enter your third number : ");

        //8. Read the third integer from the user and store it in the int variable z.
        int Z;
        Z=input.nextInt();

        //9. Compute the product of the three integers contained in variables
       // x, y and z, and store the result in the int variable result.
        int Result;
        Result=X*Y*Z;

        //10. Use System.out.printf to display the message "Product
        //is" followed by the value of the variable result.
        System.out.println("Result = " +Result);


    }

}
