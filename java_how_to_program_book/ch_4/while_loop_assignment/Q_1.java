//1. Write a program that reads a number N, calculates and displays the reverse of the number N?
package java_how_to_program_book.ch_4.while_loop_assignment;
import java.util.Scanner;
public class Q_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        System.out.println(N);
        int M=0;
        while(N>0){
           M=M*10;
          int R=N%10;
            System.out.println(R);
          N=N/10;
          M=M+R;
        }
        System.out.println(M);
       }
}
