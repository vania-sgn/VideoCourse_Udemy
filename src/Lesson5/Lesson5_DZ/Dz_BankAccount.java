package Lesson5.Lesson5_DZ;

public class Dz_BankAccount {
    String name = "Ivan";
    String surname= "Skladchykov";
    double balance  = 100;

    void popolnenieScheta (double popolnenie){
        System.out.println("На счету "+ balance);
        System.out.println("Счет пополняется на "+ popolnenie);
        balance +=popolnenie;
        System.out.println("У ПОЛЬЗОВАТЕЛЯ "+name+" "+surname);
        System.out.println("На счету "+ balance);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    void snyatieSoScheta (double snyatie){
        System.out.println("На счету "+ balance);
        System.out.println("С Счета снимается сумма "+ snyatie);
        balance -=snyatie;
        System.out.println("У ПОЛЬЗОВАТЕЛЯ "+name+" "+surname);
        System.out.println("На счету "+ balance);
}


}
class Dz_BankAccount_Test{
    public static void main(String[] args) {
        Dz_BankAccount test = new Dz_BankAccount();
        test.popolnenieScheta(20.5);
        test.snyatieSoScheta(20.5);
    }
}