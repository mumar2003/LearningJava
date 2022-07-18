/*2.35 (Car-Pool Savings Calculator) Research several car-pooling
websites. Create an application that calculates your daily driving cost, sothat you can estimate how much money could be saved by car pooling,
which also has other advantages such as reducing carbon emissions and
reducing traffic congestion. The application should input the following
information and display the user’s cost per day of driving to work:
1. Total miles driven per day.
2. Cost per gallon of gasoline.
3. Average miles per gallon.
4. Parking fees per day.
5. Tolls per day.*/
package java_how_to_program_book.ch_2;
import java.util.Scanner;
public class Q2_36 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the total miles driven per day (Hint: one miles =1.6 kilometer)");
        int MilesPerDay=input.nextInt();
        System.out.println("Enter the Gasoline cost per gallon (Hint: one gallon is 4.54 litter) ");
        int cost_of_gasoline_per_gallon = input.nextInt();
        System.out.println("Enter the Average Miles per gallon");
        int average_mile_per_gallon=input.nextInt();
        System.out.println("Parking fees per day");
        int Parking_fees_per_day=input.nextInt();
        System.out.println("cost of Tolls price per day");
        int Toll_per_day=input.nextInt();
        int totalCostPerDay=(cost_of_gasoline_per_gallon/average_mile_per_gallon)*MilesPerDay+Parking_fees_per_day+Toll_per_day;
        System.out.printf("Total cost per day %d",totalCostPerDay);
    }

}
