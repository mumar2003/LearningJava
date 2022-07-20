/*
7. 4.7 Determine the value of the variables in the statement product *=
       x++; after the calculation is performed. Assume that all variables are type
       int and initially have the value 5.
*/
package java_how_to_program_book.ch_4.exercise;

public class Q_7 {
    public static void main(String[] args) {
        int x=5;
         x*=x++;
        System.out.println("product of the value is "+x);


    }
}
