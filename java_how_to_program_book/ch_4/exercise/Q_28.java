/*
4.28 (Another Dangling-else Problem) Based on the dangling-else
discussion in Exercise 4.27 , state the output for each of the following
code segments when x is 9 and y is 11 and when x is 11 and y is 9. We
eliminated the indentation from the following code to make the problem
more challenging. [Hint: Apply the indentation conventions you’ve
learned.]
if (x < 10)
if (y > 10)
System.out.println("*****");
else
System.out.println("#####");
System.out.println("$$$$$");
if (x < 10) {
if (y > 10)
System.out.println("*****");
}
else {
System.out.println("#####");
System.out.println("$$$$$");
}
 */
package java_how_to_program_book.ch_4.exercise;

public class Q_28 {
    public static void main(String[] args) {

        int x = 9, y = 11;
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        x = 11;
        y = 9;
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");

        }
    }
}