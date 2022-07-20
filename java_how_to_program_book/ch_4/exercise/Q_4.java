//4.5 Write a Java statement to accomplish each of the following tasks:
// 1. Declare variable sum of type int and initialize it to 0.
//2. Declare variable x of type int and initialize it to 1.
//3. Add variable x to variable sum, and assign the result to variable sum.
//4. Print "The sum is: ", followed by the value of variable sum.
package java_how_to_program_book.ch_4.exercise;

public class Q_4 {
    public static void main(String[] args) {
        // 1. Declare variable sum of type int and initialize it to 0.
        int sum=0;
        //2. Declare variable x of type int and initialize it to 1.
        int x=1;
        // 3.Add variable x to variable sum, and assign the result to variable sum.
        sum=sum+x;
        //4. Print "The sum is: ", followed by the value of variable sum.
        System.out.println("The sum is: "+sum);
    }
}
