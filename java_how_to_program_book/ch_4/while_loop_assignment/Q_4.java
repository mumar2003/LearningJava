//4. Write a program that reads two numbers find and display their LCM (Least Common Multiple)?
package java_how_to_program_book.ch_4.while_loop_assignment;
import java.util.Scanner;
public class Q_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number");
        int N1=input.nextInt();
        int N4=N1;
        System.out.println("enter the second number");
        int N2=input.nextInt();
        int N5=N2;
        int N3;
        int R=1;
        if(N1>=N2){N3=N1;}
        else{N3=N2;}
        System.out.println(N3);
        int i=N3/2+1;
        int M=1;
        while (i>2) {
         if(N1%i==0 && N2%i ==0){
            N1=N1/i;
             N2=N2/i;
             M=M*i;
            }
         i--;
        }

        System.out.println(M);
        R=(N4/M);
        System.out.println(R);
        int R2=(N5/M);
        System.out.println(R2);
        int LCM=R2*R*M;
        System.out.println("lcm is "+LCM);
    }
}
