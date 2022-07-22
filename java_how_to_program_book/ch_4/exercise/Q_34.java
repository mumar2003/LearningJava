/*
4.34 (Multiples of 2 with an Infinite Loop) Write an application that
      keeps displaying in the command window the multiples of the integer 2—
      namely, 2, 4, 8, 16, 32, 64, and so on. Your loop should not terminate (i.e.,
      it should create an infinite loop). What happens when you run this
      program?
 */
package java_how_to_program_book.ch_4.exercise;

public class Q_34 {
    public static void main(String[] args) {
        long i = 1000, N = 1;

        while (i <= 1000) {
            N = N * 2;
            System.out.printf(" %d    ", N);
            System.out.println("if we store our value in int type variable then upto 31th value store if we store " + "our value inlong data we will store only 63 value  ");
        }
    }
}
