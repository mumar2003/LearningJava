/*6. 4.15 Identify and correct the errors in each of the following pieces of code.
[Note: There may be more than one error in each piece of code.]
1.  1 int x = 1, total;
    2 while (x <= 10) {
    3 total += x;
    4 ++x;
    5 }
2. 1 while (x <= 100)
   2 total += x;
   3 ++x;
3. 1 while (y > 0) {a
   2 System.out.println(y);
   3 ++y;
   */
package java_how_to_program_book.ch_4.exercise;

public class Q_15 {
    public static void main(String[] args) {
        /*
 1.
    1 int x = 1, total;
    2 while (x <= 10) {
    3 total += x;
    4 ++x;
    5 }
    */
        System.out.println("total should be  initialize before using");
        /*
2. 1 while (x <= 100)
   2 total += x;
   3 ++x;
         */
        System.out.println("braces missing for while body so loop will be infinite");
        /*
3. 1 while (y > 0) {a
   2 System.out.println(y);
   3 ++y;}
   */
        System.out.println("there is infinite loop in third line we should use -- instead of ++ ");

    }
}