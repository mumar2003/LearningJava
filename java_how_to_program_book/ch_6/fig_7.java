package java_how_to_program_book.ch_6;
import java.util.Random;
//import java.security.SecureRandom;
public class fig_7 {
    public static void main(String[] args){
        Random randomNumber=new Random();
        int frequency1=0;
        int frequency2=0;
        int frequency3=0;
        int frequency4=0;
        int frequency5=0;
        int frequency6=0;
        for(int i=1;i<=60000000;i++){
            int die=1+randomNumber.nextInt(6);
            switch (die){
                case 1:
                    frequency1++;
                    break;
                case 2:
                    frequency2++;
                    break;
                case 3:
                    frequency3++;
                    break;
                case 4:
                    frequency4++;
                    break;
                case 5:
                    frequency5++;
                    break;
                case 6:
                    frequency6++;
                    break;
            }
        }
        System.out.println("die\tfrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);

    }
}
