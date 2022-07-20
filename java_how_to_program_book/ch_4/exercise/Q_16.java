/*4.16 What does the following program print?

1 Exercise 4.16: Mystery.java
2 public class Mystery {
3 public static void main(String[] args) {
4 int x = 1;
5 int total = 0;
6 while (x <= 10) {
7 int y = x * x;
8 System.out.println(y);
9 total += y;
10 ++x;
11 }
12 System.out.printf("Total is %d%n", total);
13 }
14 }*/
package java_how_to_program_book.ch_4.exercise;

public class Q_16 {
    public static void main(String[] args) {


        int x = 1;
        int total = 0;
        while (x <= 10) {
            int y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }
        System.out.printf("Total is %d%n", total);
    }
}


