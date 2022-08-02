/*
6.7 What is the value of x after each of the following statements is
executed?
1. double x = Math.abs(7.5);
2. double x = Math.floor(7.5);
3. double x = Math.abs(0.0);
4. double x = Math.ceil(0.0);
5. double x = Math.abs(-6.4);
6. double x = Math.ceil(-6.4);
7. double x = Math.ceil(-Math.abs(-8 +
Math.floor(-5.5)));
 */
package java_how_to_program_book.ch_6;

public class Q_7 {
    public static void main(String[] args) {
        System.out.printf("double x = Math.abs(7.5) is : %f",Math.abs(7.5));
        System.out.printf("\ndouble x = Math.floor(7.5) is : %f",Math.floor(7.5));
        System.out.printf("\ndouble x = Math.abs(0.0) is : %f",Math.abs(0.0));
        System.out.printf("\ndouble x = Math.ceil(0.0) is : %f",Math.ceil(0.0));
        System.out.printf("\ndouble x = Math.abs(-6.4) is : %f",Math.abs(-6.4));
        System.out.printf("\ndouble x = Math.ceil(-6.4) is : %f",Math.ceil(-6.4));
        System.out.printf("\ndouble x = Math.ceil(-math.abs(-8+Math.floor(-5.5))) is : %f",Math.ceil(-Math.abs(-8 +
                Math.floor(-5.5))));

    }
}
