package java_how_to_program_book.ch_6;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.security.SecureRandom;
public class crap_game {
    private static final SecureRandom randomNumber =new SecureRandom();
    private enum status{CONTINUE,WON,LOSE};
    status s = status.WON;
    int a= 5;

    private static final int SNAKE_EYES=2;
    private static final int TREY=3;
    private static final int SEVEN=7;
    private static final int YO_LEVEN=11;
    private static final int BOX_CARS=12;
    public static void main(String[] args) {
        int myPoint=0;
        status gameStatus;
        int sumOfDice=rollDice();
        switch (sumOfDice){
            case SEVEN:
            case YO_LEVEN:
                gameStatus=status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus=status.LOSE;
                break;
            default:
                gameStatus=status.CONTINUE;
                myPoint=sumOfDice;
                System.out.println("my point is "+myPoint);
                break;
        }
        while(gameStatus==status.CONTINUE){
            if(sumOfDice==myPoint){
                sumOfDice=rollDice();
            }else{
                if(sumOfDice==SEVEN){
                    gameStatus=status.LOSE;
                }
            }
        }
        if (gameStatus==status.WON){
            System.out.println(sumOfDice);
            System.out.println("you won");
    }else{
            System.out.println(sumOfDice);
            System.out.println("you lose");}
    }
    public static int rollDice(){
        SecureRandom randomNumber = new SecureRandom();
        int N1=1+randomNumber.nextInt(6);
        int N2=1+randomNumber.nextInt(6);
        return N1+N2;
    }
}
