/*
6.12 Write statements that assign random integers to the variable n in the
following ranges:
1. 1 ≤ n ≤ 2.
2. 1 ≤ n ≤ 100.
3. 0 ≤ n ≤ 9.
4. 1000 ≤ n ≤ 1112.
5. –1 ≤ n ≤ 1.
6. –3 ≤ n ≤ 11.
 */
package java_how_to_program_book.ch_6;
import java.util.Random;
public class Q_12 {
    public static Random randomNumber=new Random();
    public static void main(String[] args) {
        // 1.
        int n=1+randomNumber.nextInt(2);
        System.out.printf("1<=%d<=2%n",n);
        // 2.
        n=1+randomNumber.nextInt(100);
        System.out.printf("1<=%d<=100%n",n);
        // 3.
        n=randomNumber.nextInt(9);
        System.out.printf("0<=%d<=9%n",n);
        // 4.
        n=1000+randomNumber.nextInt(113);
        System.out.printf("1000<=%d<=1112%n",n);
        // 5.
        n=-1+randomNumber.nextInt(2);
        System.out.printf("-1<=%d<=1%n",n);
       // 6.
        n=-3+randomNumber.nextInt(15);
        System.out.printf("-3<=%d<=11%n",n);
    }
}
