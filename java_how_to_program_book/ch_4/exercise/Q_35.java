/*
4.35 (What’s Wrong with This Code?) What is wrong with the following
statement? Provide the correct statement to add one to the sum of x and y.
System.out.println(++(x + y));
 */
package java_how_to_program_book.ch_4.exercise;

public class Q_35 {
    public static void main(String[] args) {
        int x=2,y=3;
        System.out.println((x+y)+1);
    }
}
