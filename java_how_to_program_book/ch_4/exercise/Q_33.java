/*
4.33 (Checkerboard Pattern of Asterisks) Write an application that
usesonly the output statements

  1. System.out.print("* ");
  2. System.out.print(" ");
  3. System.out.println();

     to display the checkerboard pattern that follows. A
     System.out.println method call with no arguments causes the
     program to output a single newline character. [Hint: Iteration statements

          * * * * * * * *
           * * * * * * * *
          * * * * * * * *
           * * * * * * * *
          * * * * * * * *
           * * * * * * * *
          * * * * * * * *
           * * * * * * * *
 */
package java_how_to_program_book.ch_4.exercise;

public class Q_33 {
    public static void main(String[] args) {
        int i = 1, j;
        while (i <= 8) {
            j = 1;
            while (j <= 16) {
                System.out.print(j % 2 == 1 ? "  " : "*");
                j++;
            }

        System.out.println();
            if(i%2==1)
            System.out.print(" ");
        i++;}
    }
}

