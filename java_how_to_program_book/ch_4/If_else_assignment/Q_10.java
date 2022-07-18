
//10. 01/01/1900, the day was Monday.  If any year is input through keyboard,
// write a program to find out the day on first January of that year?/

package If_else_assignment;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current year");
        int currentYear = input.nextInt();
        int newYear = currentYear - 1900;
        int leapYear = newYear / 4;
        newYear = newYear + leapYear;
        if (newYear % 7 == 0) {
            System.out.println("monday");
        }
        if (newYear % 7 == 1) {
            System.out.println("tuesday");
        }
        if (newYear % 7 == 2) {
            System.out.println("wednesday");
        }
        if (newYear % 7 == 3) {
            System.out.println("thursday");
        }
        if (newYear % 7 == 4) {
            System.out.println("friday");
        }
        if (newYear % 7 == 5) {
            System.out.println("saturday");
        }
        if (newYear % 7 == 6) {
            System.out.println("sunday");
        }
    }

}

