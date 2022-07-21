/*
4.22 (Tabular Output) Write a Java application that uses looping to print
the following table of values:

 */
package java_how_to_program_book.ch_4.exercise;


public class Q_22 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            if (i == 1) {
                System.out.println("    N    N*10   N*100   N*1000");
            }
            System.out.println("    " + i + "    " + i * 10 + "    " + i * 100 + "      " + i * 1000);
            i++;
        }
    }
}
