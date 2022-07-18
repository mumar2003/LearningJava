package java_how_to_program_book.ch_2;
import java.util.Scanner;
public class Q2_28 {
    public static void main(String[] args){
    //The values produced by the
        //circumference and area calculations are floating-point numbers. Such
        //values can be output with the format specifier %f in a
        //System.out.printf statement.
        Scanner input=new Scanner(System.in);
        int radius;
        System.out.println("Enter your radius");
        radius=input.nextInt();
        //circle’s diameter, circumference and area
        System.out.printf("circle_diameter= %f",(2*radius));
        System.out.printf(" circumference of the circle is %f",(2*Math.PI*radius) );
        System.out.printf(" area of the circle is %f",(Math.PI*radius*radius) );


    }
}
