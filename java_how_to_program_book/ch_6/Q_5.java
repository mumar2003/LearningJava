/*
6.5 Find the error in each of the following program segments. Explain how
to correct the error.
1.    void g() {
      System.out.println("Inside method g");
      void h() {
      System.out.println("Inside method h");
      }
      }

2.    int sum(int x, int y) {
      int result;
      result = x + y;}

3.    void f(float a); {
      float a;
      System.out.println(a);
     }

4.   void product() {
     int a = 6;
     int b = 5;
     int c = 4;
     int result = a * b * c;
     System.out.printf("Result is %d%n", result);
     return result;
     }

 */
package java_how_to_program_book.ch_6;

public class Q_5 {
    public static void h() {
    }

    ;

    public static void main(String[] args) {
        //Find the error in each of the following program segments. Explain how to correct the error.
        //1. we can not declare method within method
        //2.we d't return any value in this Method
        //3. float 'a' already declare in the parenthesis
        //4. void method d't return any value but in this function we return a value
    }
}
