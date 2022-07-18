package java_how_to_program_book.ch_2;

public class Q2_14 {
    public static void main(String[] args){
        //2.14 Write an application that displays the numbers 1 to 4 on the same
        //line, with each pair of adjacent numbers separated by one space. Use the
        //following techniques:
        int a=1,b=2,c=3,d=4;
        //1. Use one System.out.println statement.
        System.out.println(" "+a+" "+b+" "+c+" "+d);
        //2. Use four System.out.print statements.
        System.out.print(" "+a);
        System.out.print(" "+b);
        System.out.print(" "+c);
        System.out.print(" "+d +" ");
        //3. Use one System.out.printf statement.
       System.out.printf("%n %d %d %d %d",a, b, c, d);
    }
}
