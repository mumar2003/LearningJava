//9. A pharmaceutical company pays 10% house rent and 90% daily allowance of basic salary to its employees
// if the basic pay of the employee is less than 1500. The company pays 20% house rent and 95% daily
// allowance of basic salary to its employees if the basic pay of the employee is greater than or equal to 1500.
// Write an algorithm that takes basic salary of an employee and calculate and prints his gross salary?
package If_else_assignment;
import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the salary");
        float salary=input.nextInt();
        float grossSalary = 0;
        if(salary<1500){
            float houseRent=salary/100*10;
            System.out.println("houseRent "+houseRent);
            float basicAllowance=salary/100*90;
            System.out.println("basicAllowance "+basicAllowance);
            grossSalary=salary+houseRent+basicAllowance;
        }
        if(salary>=1500){
            float houseRent=salary/100*20;

            float basicAllowance=salary/100*95;
            grossSalary=salary+houseRent+basicAllowance;
        }
        System.out.println(" gross salary is = "+ grossSalary);
        
    }
}
