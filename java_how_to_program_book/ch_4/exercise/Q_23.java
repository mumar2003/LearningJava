/*
4.23 (Find the Two Largest Numbers) Using an approach similar to that
for Exercise 4.21 , find the two largest values of the 10 values entered.
[Note: You may input each number only once.]
 */
package java_how_to_program_book.ch_4.exercise;

import java.util.Scanner;

public class Q_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, number, largestNumber1, largestNumber2;
        System.out.println("Enter the first number");
        number = input.nextInt();
        largestNumber1 = number;
        i++;
        System.out.println("Enter the second number");
        number = input.nextInt();
        largestNumber2 = number;
        i++;
        while (i <= 10) {
            System.out.println("Enter the " + i + " number");
            number = input.nextInt();
            if (number > largestNumber2 || number > largestNumber1) {

                    if (largestNumber1 >= largestNumber2) {
                        largestNumber2=largestNumber1;
                        largestNumber1 = number;
                    }else{
                        largestNumber1=largestNumber2;
                        largestNumber2=number;
                }
            }
            i++;
        }
        System.out.println(largestNumber1+" "+largestNumber2);
    }
}
