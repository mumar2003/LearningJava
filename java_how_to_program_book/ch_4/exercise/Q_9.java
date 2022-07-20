/*
9. 4.9 What is wrong with the following while statement?
   1  while (z >= 0) {
   2  sum += z;
   3  }
*/
package java_how_to_program_book.ch_4.exercise;

public class Q_9 {
    public static void main(String[] args) {
       /* while(z>=0){
            sum+=z
        }*/
        System.out.println("z did not decrease in while loop so loop will be continue if its start");
    }
}
