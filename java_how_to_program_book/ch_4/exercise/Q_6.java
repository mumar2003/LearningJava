/*6. 4.6 Combine the statements that you wrote in Exercise 4.5 into a Java
         application that calculates and prints the sum of the integers from 1 to 10.
         Use a while statement to loop through the calculation and increment
         statements. The loop should terminate when the value of x becomes 11.
*/
package java_how_to_program_book.ch_4.exercise;

public class Q_6 {
    public static void main(String[] args) {
        int sum=0;
        int x=1;
        while(x<11){
            sum+=x;
            x++;
        }
        System.out.println(sum);
    }
}
