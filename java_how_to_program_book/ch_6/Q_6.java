/*
6.6 Declare method sphereVolume to calculate and return the volume
of the sphere. Use the following statement to calculate the volume:
  double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
Write a Java application that prompts the user for the double radius of a
sphere, calls sphereVolume to calculate the volume and displays the
result.
 */
package java_how_to_program_book.ch_6;
import java.util.Scanner;
import java.lang.Math;
public class Q_6 {
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please Enter the radius of your volume");
        int radius=input.nextInt();
        System.out.printf("your volume of the sphere is = "+sphereVolume(radius));

    }
    public static double sphereVolume(double radius){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
