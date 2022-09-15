package Lesson4;

import java.sql.SQLOutput;

public class BankAccount {
    int id;
    String name;
    Double balance;
}
class BankAccount_users{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount ThemAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.balance=20.0;
        MyAccount.name = "Sanya";

        ThemAccount.id=2;
        ThemAccount.balance=200.0;
        ThemAccount.name = "Them";

        System.out.println(MyAccount.balance);
        System.out.println(ThemAccount.name);
    }


}
