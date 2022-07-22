package java_how_to_program_book.ch_4.exercise;
import java.util.Scanner;
public class Q_reverseOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int i=1,R,RN,N2=0;
        while(N>0){
            R=N%10;
            N2=N2*i+R;
            i=10;
            N=N/i;
        }
        System.out.println(N2);
    }
}
