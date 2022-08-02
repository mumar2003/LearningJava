package java_how_to_program_book.ch_6;
import java.security.SecureRandom;
public class fig_6 {
    public static void main(String[] args) {
        SecureRandom randomNumber=new SecureRandom();
        for(int i=1; i<=20; i++){
            int face=1+randomNumber.nextInt(6);
            System.out.printf(" %d",face);
            if (i%5==0){
                System.out.println();
            }
        }
    }
}
