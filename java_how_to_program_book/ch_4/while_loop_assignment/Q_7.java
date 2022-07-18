//7. Write a program that uses a while loop statement to calculate and print the average of
// several integers.Assume the last value read is sentinel 9999?
package java_how_to_program_book.ch_4.while_loop_assignment;
import java.util.Scanner;
public class Q_7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N1=0;
        int sum=0;
        int count=0;
        float average;
        while (N1 != 9999) {
            System.out.println("please enter the number");
            N1=input.nextInt();
            if (N1 == 9999) {
                break;}
            else {
                sum=sum+N1;
                System.out.println(sum);
                count++;
                System.out.println(count);
            }
        }
        average=sum/count;
        System.out.println(average);
    }
}