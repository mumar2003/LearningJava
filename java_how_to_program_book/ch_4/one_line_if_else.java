package java_how_to_program_book.ch_4;

import java.util.Scanner;

public class one_line_if_else {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your age");
        int age;
        age=input.nextInt();
        System.out.println(age>=18 ?"you are valid for vote cost":"you are invalid for vote cost");
    }
}
