package If_else_assignment;
import java.util.Scanner;
public class Q_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float N1;
        float N2;
        System.out.println("Please Enter the first number");
        N1=input.nextFloat();
        System.out.println("Please Enter the Second number");
        N2=input.nextFloat();
        char ch;
        System.out.println("Please Enter the operation");
        ch=input.next().charAt(0);
        float result;
        if(ch=='/'){
            result=N1/N2;
            System.out.printf("result=%f",result);}
            else{
            if(ch=='*'){
                result=N1*N2;
                System.out.printf("result=%f",result);}
             else{
                if(ch=='+'){
                    result=N1+N2;
                    System.out.printf("result=%f",result);}
                else{
                    if(ch=='-'){
                        result=N1-N2;
                        System.out.printf("result=%f",result);}
                    else {System.out.println("you are put invalid operation");}
                }
             }

            }
            }
}
