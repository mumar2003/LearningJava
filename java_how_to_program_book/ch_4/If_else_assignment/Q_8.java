//8. Write a program that takes the length of two legs of a
// right triangle as input and calculates the area and hypotenuse?
package If_else_assignment;
import java.util.Scanner;
public class Q_8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float perpendicular;
        System.out.println("Enter the length of perpendicular");
        perpendicular=input.nextInt();
        float base;
        System.out.println("Enter the length of base");
        base=input.nextInt();
        float area=(perpendicular*base)/2;
        System.out.println("Area of a right angle triangle is = "+area);
        float answer =base*base+perpendicular*perpendicular;
        float hypotenuse = (float) Math.sqrt(answer);
        System.out.println("hypotenuse of triangle = " +hypotenuse);
    }
}
