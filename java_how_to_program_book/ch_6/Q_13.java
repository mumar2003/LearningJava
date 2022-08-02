/*
6.13 Write statements that will display a random number from each of the
following sets:
1. 2, 4, 6, 8, 10.
2. 3, 5, 7, 9, 11.
3. 6, 10, 14, 18, 22.
 */
package java_how_to_program_book.ch_6;
import java.security.SecureRandom;
public class Q_13 {
    public static SecureRandom randomNumber=new SecureRandom();
    public static void main(String[] args) {
        int N1=2+2*randomNumber.nextInt(5);
        System.out.println("1 = "+N1);
        N1=3+2*randomNumber.nextInt(5);
        System.out.println("2 = "+N1);
        N1=6+4*randomNumber.nextInt(5);
        System.out.println("3 = "+N1);

    }
}
