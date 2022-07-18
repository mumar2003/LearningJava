/*2.31 (Table of Squares and Cubes) Using only the programming
        techniques you learned in this chapter, write an application that calculates
        the squares and cubes of the numbers from 0 to 10 and prints the resulting
        values in table format, as shown below.
        number
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        square
        0
        1
        4
        9
        16
        25
        36
        49
        64
        81
        100
        cube
        0
        1
        8
        27
        64
        125
        216
        343
        512
        729
        1000*/
package java_how_to_program_book.ch_2;

public class Q2_31 {
    public static void main(String[] args){
        System.out.println("number    square    cube");
        System.out.println("0         0         1");
        System.out.println("1         1         1");
        System.out.println("2         4         8");
        System.out.println("3         9         27");
        System.out.println("4         16        64");
        System.out.println("5         25        125");
        System.out.println("6         36        216");
        System.out.println("7         49        343");
        System.out.println("8         64        512");
        System.out.println("9         81        729");
        System.out.println("10        100       1000");
        //use printf
        int n=0;
        System.out.println("Number   Square    cube");
        System.out.printf("%d       %d         %d%n",n,(n*n),(n*n*n));
        n=1;
        System.out.printf("%d       %d         %d%n",n,n*n,n*n*n);
        n=2;
        System.out.printf("%d       %d         %d%n",n,n*n,n*n*n);
        n=3;
        System.out.printf("%d       %d         %d%n",n,n*n,n*n*n);
        n=4;
        System.out.printf("%d       %d        %d%n",n,n*n,n*n*n);
        n=5;
        System.out.printf("%d       %d        %d%n",n,n*n,n*n*n);
        n=6;
        System.out.printf("%d       %d        %d%n",n,n*n,n*n*n);
        n=7;
        System.out.printf("%d       %d        %d%n",n,n*n,n*n*n);
        n=8;
        System.out.printf("%d       %d        %d%n",n,n*n,n*n*n);
        n=9;
        System.out.printf("%d       %d        %d%n",n,n*n,n*n*n);
        n=10;
        System.out.printf("%d      %d       %d%n",n,n*n,n*n*n);

    }
}
