/*
8. 4.8 Identify and correct the errors in each of the following code segments
—assume that all variables have been properly declared and initialized:
1. 1 while (c <= 5) {
   2  product *= c;
   3   ++c;
2. 1 if (gender == 1) {
   2 System.out.println("Woman");
   3 }
   4 else; {
   5 System.out.println("Man");
     }
*/
package java_how_to_program_book.ch_4.exercise;

public class Q_8 {
    public static void main(String[] args) {
        /*in this program body does n't close
        while (c <= 5) {
             product *= c;
               ++c;
               }  missing statement
               */
        System.out.println("'}' while block did not close ");
        /*
        2. 1 if (gender == 1) {
           2 System.out.println("Woman");
           3 }
           4 else; {
           5 System.out.println("Man");
            }
           */
        System.out.println("in second program line number 4 after  else semicolon added");
    }
}
