/*Create a BMI calculator that reads the user’s weight in pounds and height
in inches (or, if you prefer, the user’s weight in kilograms and height in
meters), then calculates and displays the user’s body mass index. Also,
display the BMI categories and their values from the National Heart Lung
and Blood Institute
*/
package java_how_to_program_book.ch_2;

import java.util.Scanner;
public class Q2_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kilogram");
        int weight = input.nextInt();
        int pound= (int)(weight/.453592);
        System.out.println("Enter your Height in inches ");
        int Height=input.nextInt();
        int BMI=pound*703/(Height*Height);
        System.out.printf("Your body BMI is %d",BMI);
        //bmi<18.5 below normal weight
        if(BMI<18.5)
            System.out.println("you are below normal weight");
        else if(BMI>=18.5 && BMI<25)
            System.out.println("you are normal weight");
        else  if(BMI>=25 && BMI<30)
            System.out.println("you are overweight");
        else if(BMI>=30 && BMI<35)
            System.out.println(" Class 1 obesity that mean control diet");
        else if(BMI>=35 && BMI<40)
            System.out.println("Class 2 Obesity that mean you are in risk point");
        else if(BMI>=40)
            System.out.println("Class 3 Obesity that mean you are going to  graveyard");

    }
}
