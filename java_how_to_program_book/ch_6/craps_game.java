package java_how_to_program_book.ch_6;
import java.security.SecureRandom;
public class craps_game {

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    private static SecureRandom randomNumber=new SecureRandom();
    public static void main(String[] args) {
        int N1=RollDice();
        int N3=N1;
        int N2=RollDice();
        int sum=sumFuntion(N1,N2);
        System.out.println("first rolling sum is "+sum);
        int N4=N2;
        //  System.out.println(sum);

        if(sum==7||sum==11){
            System.out.println("you win your 1st dice is = " +N3+ " your second dice is = "+N4+" your sum is "+sum);
        }
        else if(sum==2 || sum==3 ||sum==12){
            System.out.println("you lose your 1st dice is = " +N3+ " your second dice is = "+N4+" your sum is "+sum);
        }
        else {
            int i=0;// for while loop
            final int number=sum;
            System.out.println("you need "+number+" before 7 is coming");
            do {
                N3 = RollDice();
                N4 = RollDice();
                sum = sumFuntion(N3, N4);
                System.out.println("sum is "+sum);
                if (sum == 7) {
                    System.out.println("you lose");
                    break;
                } else if (number==sum){
                    System.out.println("you won");
                    break;
                }
            } while (sum != 0 );
        }
    }//end main function........
    public static int RollDice(){
        int N1=1+randomNumber.nextInt(6);
        return N1;
    }
    public static int sumFuntion(int n,int n2){
        return n+n2;
    }
}
