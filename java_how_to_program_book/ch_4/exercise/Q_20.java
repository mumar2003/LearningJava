/*
4.20 (Salary Calculator) Develop a Java application that determines the
gross pay for each of three employees. The company pays straight time for
the first 40 hours worked by each employee and time and a half for all
hours worked in excess of 40. You’re given a list of the employees, their
number of hours worked last week and their hourly rates. Your program
should input this information for each employee, then determine and
display the employee’s gross pay. Use class Scanner to input the data.
 */


package java_how_to_program_book.ch_4.exercise;

import java.util.Scanner;

public class Q_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float i, hours, rates, salary;
        int j = 1;
        while (j != 0) {
            System.out.println("enter your working hours in a week");
            hours = input.nextFloat();
            if (hours > 40) {
                i = (float) ((hours - 40) * 1.5);
                hours = 40 + i;
                System.out.println(hours);
            }
            System.out.println("Enter your working hourly rates ");
            rates = input.nextInt();
            salary = rates * hours;
            System.out.println("Your salary is = " + salary);
            System.out.println("for finish program enter 0 for continue enter 1");
            j = input.nextInt();
        }

    }

}
