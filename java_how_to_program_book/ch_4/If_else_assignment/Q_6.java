//6. Read two positive integer numbers N1 & N2 and then test whether the larger number is
// exactly divisible by the smaller one. In the process,check that the input numbers
// are valid (N1 &N2>0) and then check which of the number is greater?
package If_else_assignment;
import java.util.Scanner;
public class Q_6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N1=input.nextInt();
        int N2=input.nextInt();
        if(N1>0 & N2>0) {
            int greater;
            int smaller;
            if (N1 > N2) {
                greater = N1;}
            else
            {greater = N2;}

            if (N1 < N2) {
                smaller = N1;
            } else {
                smaller = N2;
            }
            int number=0;
             if(greater%smaller==0){
                 System.out.println("larger number is exactly divisible by smaller one");}
             else{
                 System.out.println("larger Number is not exactly divisible by smaller one");}


        }
    }
}
