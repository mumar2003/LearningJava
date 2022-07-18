//5. Write a program that finds minimum and maximum
// of three numbers using multiple-if or nested-if statement?
package If_else_assignment;
import java.util.Scanner;
public class Q_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int N1=input.nextInt();
        System.out.println("Enter the second number");
        int N2=input.nextInt();
        System.out.println("Enter the third number");
        int N3=input.nextInt();
        int greater;
        if(N1>N2 && N2>N3){
            greater=N1;
            System.out.println("maximum number ="+greater);}
        if(N2>N3 && N2>N1){
            greater=N2;
            System.out.println("maximum number ="+greater);}
        if(N3>N1 && N3>N2){
            greater=N3;
            System.out.println("maximum number ="+greater);}
        int smaller;
        if(N1<N2 && N2<N3){
            smaller=N1;
            System.out.println("minimum number ="+smaller);}
        if(N2<N3 && N2<N1){
            smaller=N2;
            System.out.println("minimum number ="+smaller);}
        if(N3<N1 && N3<N2){
            smaller=N3;
            System.out.println("minimum number ="+smaller);}

    }
}
