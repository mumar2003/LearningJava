//4. Write segment of a program that reads a grade A,B,C,D or F and then prints Excellent,
// Good, Fair, Poor or Failure depending on the grade. Use multiple if statement?
package If_else_assignment;
import java.util.Scanner;
public class Q_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char segment= input.next().charAt(0);
        if(segment=='A' || segment=='a'){
            System.out.println("Excellent");}
        if(segment=='B' || segment=='b'){
            System.out.println("Good");}
        if(segment=='C' || segment=='c'){
            System.out.println("Fair");}
        if(segment=='D'|| segment=='d'){
            System.out.println("Poor");}
        if(segment=='F' || segment=='f'){
            System.out.println("Failure");
        }


    }
}
