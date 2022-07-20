/*4.18 (Credit Limit Calculator) Develop a Java application that determines
whether any of several department-store customers has exceeded the credit
limit on a charge account. For each customer, the following facts are
available:
1. account number
2. balance at the beginning of the month
3. total of all items charged by the customer this month
4. total of all credits applied to the customer’s account this month
5. allowed credit limit.
The program should input all these facts as integers, calculate the new
balance (= beginning balance + charges – credits), display the new
balance and determine whether the new balance exceeds the customer’s
credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".*/
package java_how_to_program_book.ch_4.exercise;

import java.util.Scanner;

public class Q_18 {
    public static void main(String[] args) {
        int i = 0;
        int accountNumber,balance,charges,credit,creditLimit,newBalance;
        while (i == 1) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter you account number");
            accountNumber = input.nextInt();
            System.out.println("Please Enter balance at the beginning of the month");
            balance = input.nextInt();
            System.out.println("Please Enter charges");
            charges=input.nextInt();
            System.out.println("Please Enter credit");
             credit=input.nextInt();
            System.out.println("Please Enter credit limit");
             creditLimit=input.nextInt();
             newBalance=( balance + charges)-credit;
             if(newBalance<creditLimit){
                 i++;
             }
            System.out.println("Account Number = "+accountNumber);
            System.out.println("your credit limit exceed");
        }
    }
}