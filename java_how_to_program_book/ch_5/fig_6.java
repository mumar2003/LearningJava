package java_how_to_program_book.ch_5;

public class fig_6 {
    public static void main(String[] args) {
        double initialAmount=1000;
        double interestRate=0.05;
        System.out.printf("%s%25s%n","year","Amount Of Deposit");
        for(int i=1; i<=10;i++){
            initialAmount =(initialAmount*.05)+initialAmount;
            System.out.printf("%4d %24.2f%n",i,initialAmount);
        }
    }
}
