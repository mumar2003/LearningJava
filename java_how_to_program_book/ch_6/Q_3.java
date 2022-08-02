/*
6.3 Write an application that tests whether the examples of the Math class
method calls shown in Fig. 6.2 actually produce the indicated results.
 */
package java_how_to_program_book.ch_6;
import java.lang.Math;
public class Q_3 {
    public static void main(String[] args) {
        System.out.printf("Math.abs(23.7) = %f%n", Math.abs(23.7));
        System.out.printf("Math.abs(0.0) = %f%n", Math.abs(0.0));
        System.out.printf("Math.abs(-23.7) = %f%n", Math.abs(-23.7));

        System.out.printf("Math.celi(9.2) = %f%n", Math.ceil(9.2));
        System.out.printf("Math.celi(-9.8) = %f%n", Math.ceil(-9.8));

        System.out.printf("Math.cos(0.0) = %f%n", Math.cos(0.0));

        System.out.printf("Math.exp(1.0) = %f%n", Math.exp(1.0));
        System.out.printf("Math.exp(2.0) = %f%n", Math.exp(2.0));

        System.out.printf("Math.floor(9.2) = %f%n", Math.floor(9.2));
        System.out.printf("Math.floor(-9.8) = %f%n", Math.floor(-9.8));

        System.out.printf("Math.log(Math.E) = %f%n", Math.log(Math.E));
        System.out.printf("Math.log(Math.E*Math.E) = %f%n", Math.log(Math.E*Math.E));

        System.out.printf("Math.max(2.3,12.7) = %f%n", Math.max(2.3,12.7));
        System.out.printf("Math.max(-2.3,-12.7) = %f%n", Math.max(-2.3,-12.7));

        System.out.printf("Math.min(2.3,12.7) = %f%n", Math.min(2.3,12.7));
        System.out.printf("Math.min(-2.3,-12.7) = %f%n", Math.min(-2.3,-12.7));


        System.out.printf("Math.pow(2,7) = %f%n", Math.pow(2,7));
        System.out.printf("Math.pow(9,.5) = %f%n", Math.pow(9,.5));

        System.out.printf("Math.sin(0.0) is = %f%n",Math.sin(0.0));

        System.out.printf("Math.sqrt(900) is = %f%n",Math.sqrt(900));

        System.out.printf("Math.tan(0.0) is = %f%n",Math.tan(0.0));

    }
}
