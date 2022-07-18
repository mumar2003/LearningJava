//Assuming that x = 2 and y = 3, what does each of the following statements display?
package java_how_to_program_book.ch_2;

public class Q2_10 {
    public static void main(String[] args){
           int x=2;
          int y=3;
          System.out.printf("x = %d%n", x);
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
        System.out.printf("x = \n");

        System.out.printf("%d = %d%n", (x + y), (y+ x));}
}
