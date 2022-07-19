//9.One large chemical company pays its salespeople on commission basis.The salespeople each receive
// $200 per week plus 9% of their gross sales for that week.  For example, sales persons who sells $5000 worth
//  of chemicals in a weak receives $200 plus 9% of $5000,or a total of $650. Develop a program that uses
//  while statement to input each salesperson’s gross sales for last week and calculates and displays
//  that salesperson’s earnings. Process one salespersons figures  at time.
package java_how_to_program_book.ch_4.while_loop_assignment;
import java.util.Scanner;
public class Q_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("if you want to your salary in the week please enter y");
        char operation = input.next().charAt(0);
        while (operation == 'Y' || operation== 'y') {
            System.out.println("Please Enter your last week sales");
            int sales = input.nextInt();
            int commission = sales / 100 * 9;
            int earing = 200 + commission;
            System.out.println("your weekly income is = $" + earing+"\n");
        }

    }
}