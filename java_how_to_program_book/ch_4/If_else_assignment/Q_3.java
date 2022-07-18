//            3. Write a program that calculates roots of quadratic equation.
//            Implement all three cases of roots.
//            (Roots are equal/roots are real/roots are imaginary)?
package If_else_assignment;
import java.util.Scanner;
public class Q_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the coefficient of X^2");
        int X2=input.nextInt();
        System.out.println("Enter the coefficient if X");
        int x=input.nextInt();
        System.out.println("Enter the constant");
        int constant=input.nextInt();
        float discriminant=x*x-4*X2*constant;
        System.out.println("discriminant is ="+discriminant);
        if(discriminant==0){
            System.out.println("Root are real");
        }
        else {
            if(discriminant<0){
                System.out.println("Root are imaginary");}
                else{
                    System.out.println("Root are equal");
                }
            }
        }
    }

