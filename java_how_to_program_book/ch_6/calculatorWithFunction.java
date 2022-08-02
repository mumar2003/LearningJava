package java_how_to_program_book.ch_6;
import java.util.Scanner;

public class calculatorWithFunction {
    public static int add(int  a,int b){
       return (a+b);
    }

    public static int  subtract(int a,int b){
        return a-b;
    }
    public static int  multiple(int a,int b){
        return a*b;
    }
    public static int  division(int a,int b){

        return a/b;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int N1=input.nextInt();
        System.out.println("Please enter the second number");
        int N2= input.nextInt();
        System.out.println("Please Enter your operation that you want to perform");
        char operation=input.next().charAt(0);
        switch(operation){
            case '+' :
                System.out.println( add(N1,N2));
                break;
            case '-' :
                System.out.println(subtract(N1,N2));
                break;
            case '/' :
                System.out.println(division(N1,N2));
                break;
            default:
                System.out.println("Invalid choice!");

        }

    }
}
