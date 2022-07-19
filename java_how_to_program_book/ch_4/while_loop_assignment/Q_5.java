//5. Write a program that reads numbers repeatedly until zero is entered, find and display the smallest and
//  the largest number. Use while loop statement.
package java_how_to_program_book.ch_4.while_loop_assignment;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
        int N1 = input.nextInt();
        int small=0, large=0, temp = N1;
        int i=0;
        int M1;
        while (N1 != 0) {
            System.out.println("this program will be taking input util you enter 0");
            System.out.println("Please Enter the Number");
            M1 = input.nextInt();
            if (M1 == 0) {
                System.out.println("You Enter 0 so your program finished");
                N1 = M1;
                break;
            } else {
                 while(i<2) {
                     if (M1 > N1) {
                         large=M1;
                     }else{
                             large=N1;
                         }
                     if(M1<N1){
                       small=M1;
                     }else {
                         small=N1;
                     }
                     i++;
                     }
                 if(M1>large){
                     large=M1;
                 }else{
                     if(M1<small){
                         small=M1;
                     }
                 }
                 }
                 }
        System.out.println("small number is = "+small);
        System.out.println("large number is = "+large);
            }
//ghjj
    }
