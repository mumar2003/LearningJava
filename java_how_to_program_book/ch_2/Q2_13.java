//2.13 State the order of evaluation of the operators in each of the following
package java_how_to_program_book.ch_2;

public class Q2_13 {
    public static void main(String[] args){
      //2.13 State the order of evaluation of the operators in each of the following
        //Java statements, and show the value of x after each statement is performed:

        int x = 7 + 3 * 6 / 2 - 1;
        //15
        System.out.println(x);
        int y = 2 % 2 + 2 * 2 - 2 / 2;
        //3
        System.out.println(y);
        int z = (3 * 9 * (3 + (9 * 3 / (3))));
        //27*12=324
        System.out.println(z);


    }
}
