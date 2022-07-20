/*
4.19 (Sales Commission Calculator) A large company pays its
salespeople on a commission basis. The salespeople receive $200 per
week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives
$200 plus 9% of $5,000, or a total of $650. You’ve been supplied with a
list of the items sold by each salesperson. The values of these items are
shown in Fig. 4.33 . Develop a Java application that inputs one
salesperson’s items sold for last week and calculates and displays that
salesperson’s earnings. There’s no limit to the number of items that can be
sold.
Item
Value
    1 239.99
    2 129.75
    3 99.95
    4 350.89
 */
package java_how_to_program_book.ch_4.exercise;

import java.util.Scanner;

public class Q_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int items = 0, i = 1, values, wholesales = 0, weeklySalary = 200;
        float commision, earning;
        System.out.println("Enter how many item you sale in this week");
        items = input.nextInt();
        if (items > 0) {
            while (i <= items) {
                System.out.println("Enter the value of " + i + " items");
                values = input.nextInt();
                wholesales = wholesales + values;
                i++;
            }
            System.out.println("your wholeSales in this week is = " + wholesales);
            commision = wholesales / 100 * 9;
            System.out.println("you commision in this week is = " + commision);
            earning = weeklySalary + commision;
            System.out.println("you earning in this week is = " + earning);
        }
    }
}