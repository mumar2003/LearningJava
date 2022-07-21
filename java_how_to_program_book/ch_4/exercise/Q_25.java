/*
4.25 What does the following program print?

// Exercise 4.25: Mystery2.java
1. public class Mystery2 {
2. public static void main(String[] args) {
3. int count = 1;
4. while (count <= 10) {
5. System.out.println(count % 2 == 1 ? "****" : "++++++++");
6. ++count;
          }
      }
   }
 */
package java_how_to_program_book.ch_4.exercise;

public class Q_25 {
    public static void main(String[] args) {
         int count = 1;
         while (count <= 10) {
             System.out.println(count % 2 == 1 ? "****" : "++++++++");
             ++count;
        }
    }
}

