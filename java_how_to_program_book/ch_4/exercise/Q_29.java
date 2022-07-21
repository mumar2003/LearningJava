/*
4.29 (Another Dangling-else Problem) Based on the dangling-else
discussion in Exercise 4.27 , modify the following code to produce theoutput shown. Use proper indentation techniques. You must not make any
additional changes other than inserting braces and changing the code’s
indentation. We’ve eliminated the indentation from the following code to
make the problem more challenging. [Note: It’s possible that no
modification is necessary.]

1. if (y == 8)
2. if (x == 5)
3. System.out.println("@@@@@");
4. else
5. System.out.println("#####");
6. System.out.println("$$$$$");
7. System.out.println("&&&&&");

1. Assuming that x = 5 and y = 8, the following output is
produced:
@@@@@
$$$$$
&&&&&

2. Assuming that x = 5 and y = 8, the following output is
produced:
@@@@@

3. Assuming that x = 5 and y = 8, the following output is
produced:
@@@@@
&&&&&

4. Assuming that x = 5 and y = 7, the following output is
produced. [Note: The last three output statements after the else
are all part of a block.]#####
$$$$$
&&&&&

 */
package java_how_to_program_book.ch_4.exercise;

public class Q_29 {
    public static void main(String[] args) {

        /*1. Assuming that x = 5 and y = 8, the following output is
        produced:
              @@@@@
              $$$$$
              &&&&&
        */
        System.out.println("your first output is \n");

        int x = 5, y = 8;

        if (y == 8) if (x == 5) {
            System.out.println("@@@@@");
        } else {
            System.out.println("#####");
        }
        System.out.println("$$$$$");
        System.out.println("&&&&&");
        System.out.println("\nyout second output is");

        /*2. Assuming that x = 5 and y = 8, the following output is
        produced:
        @@@@@
         */

        x = 5;
        y = 8;

        if (y == 8) if (x == 5) {
            System.out.println("@@@@@");
        } else {
            System.out.println("#####");

            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }

        System.out.println("\nyour third output is");
        /*3. Assuming that x = 5 and y = 8, the following output is
        produced:
              @@@@@
              &&&&&
        */

        x = 5;
        y = 8;

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
            }
        } else {
            System.out.println("$$$$$");
        }

        System.out.println("&&&&&");

        System.out.println("\nyour forth output is");
        /*4. Assuming that x = 5 and y = 7, the following output is
        produced. [Note: The last three output statements after the else
        are all part of a block.]
            #####
            $$$$$
            &&&&&
        */

        x = 5;
        y = 7;

        if (y == 8) {
            if (x == 5) {
            System.out.println("@@@@@");
        } }else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }
}