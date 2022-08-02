package java_how_to_program_book.ch_6;

import java.security.SecureRandom;

public class book_example {

    private enum status {CONTINUE, WON, LOSE}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    private static final SecureRandom randomNumber = new SecureRandom();

    public static void main(String[] args) {
        int mypoint = 0;
        status gameStatus;
        int N1 = RollDice();
        int N2 = RollDice();
        int sum = sumFuntion(N1, N2);
        System.out.println("first rolling sum is " + sum);
        switch (sum) {
            //  System.out.println(sum);
            case SEVEN:
            case YO_LEVEN:
                System.out.println("you win your 1st dice is = " + N1 + " your second dice is = " + N2 + " your sum is " + sum);
                gameStatus = status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                System.out.println("you lose your 1st dice is = " + N1 + " your second dice is = " + N2 + " your sum is " + sum);
                gameStatus = status.LOSE;
                break;
            default:
                gameStatus = status.CONTINUE;
                mypoint = sum;
                System.out.println(mypoint);
                break;
        }
        while (gameStatus == status.CONTINUE) {
             N1=RollDice();
             N2=RollDice();
           sum= sumFuntion(N1,N2);
           if(sum==mypoint){
               gameStatus=status.WON;
           }else if(sum==SEVEN)
               gameStatus=status.LOSE;
           }


        if (gameStatus == status.WON) {
            System.out.println("player win");
        } else {
            System.out.println("player lose");
        }
    }

    public static int RollDice() {
        int N1 = 1 + randomNumber.nextInt(6);
        return N1;
    }

    public static int sumFuntion(int n, int n2) {
        return n + n2;
    }
}
