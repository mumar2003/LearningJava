package If_else_assignment;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your age");
        int age;
        age=input.nextInt();
        if(age<=18) {
            System.out.println("you are child");}
        else{
            if(age>18 && age<=35)
            {System.out.println("you are Adult");}
            else{
                if(age>35)
                { System.out.println("you are senior");}
            }
        }
    }
}
