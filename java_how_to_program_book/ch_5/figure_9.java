
package java_how_to_program_book.ch_5;

import java.util.Scanner;

public class figure_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0, gradeCounter = 0, total = 0;
        double average = 0;
        System.out.printf("%s%n %s%n %s%n  %s%n", "Enter your grade between 1-100.",
                "type of end_of_file indicator to terminate input",
                "on unix/Linux/maxOS type <ctrl> s then press Enter",
                "On window type <ctrl> z then press Enter");
        while (input.hasNext()) {
            System.out.println("Please Enter your marks");
            marks = input.nextInt();
            total = total + marks;
            gradeCounter++;
            switch (marks / 10) {
                case 10:
                case 9:
                case 8:
                    aCount++;
                    break;
                case 7:
                    bCount++;
                    break;
                case 6:
                    cCount++;
                    break;
                case 5:
                    dCount++;
                    break;
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    fCount++;
            }
            if (gradeCounter > 0) {
                average = total / gradeCounter;
                System.out.printf("%s%f", "your average grade is", average);
                System.out.printf("%s%d %s%d %n", "total of", gradeCounter, "grades enterd of", total);
                System.out.printf("%s%f%n", "class average is ", average);
                System.out.printf("%s", "how many grades of getting the class");
                System.out.printf("%n%s%d%n %s%d%n %s%d%n %s%d%n %s%d%n",
                        "A: ", aCount,
                        "B: ", bCount,
                        "C: ", cCount,
                        "D: ", dCount,
                        "f: ", fCount);
            }
            else
            {
                System.out.println("You does not enter any grade");
            }
        }
    }
}