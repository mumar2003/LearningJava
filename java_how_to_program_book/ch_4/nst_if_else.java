package java_how_to_program_book.ch_4;
import java.util.Scanner;
public class nst_if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        marks = input.nextInt();
        if (marks >=90) {
            System.out.println("your have get A grade");}
        else {
           if(marks>=80){
               System.out.println("you have get B grade");}
            else{
                if(marks>=70){
                    System.out.println("you have get c grade");}
                else{
                    if(marks>=60){
                        System.out.println("you have get d grade");}
                        else{
                        System.out.println("you are fail");
                    }
                    }
                }
            }
        }

    }
