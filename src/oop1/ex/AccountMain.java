package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account bank = new Account();

        bank.deposit(10000);
        bank.withdraw(9000);
        bank.withdraw(2000);

        System.out.println("잔고 : " + bank.balance);
    }
}
