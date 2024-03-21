package lesson6;

public class CreditCard {
    private final int accountNumber;
    private int balance;

    public CreditCard(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void replenishmentCard(int sum) {
        this.balance += sum;
    }

    public int withdrawCard(int sum) {
        if (this.balance >= sum) {
            this.balance -= sum;
            return balance;
        } else {
            System.out.printf("На счету %d недостаточно средств", accountNumber);
            System.out.println();
            return -1;
        }
    }

    public void cardInfo() {
        System.out.printf("Ваш номер счета - %d, ваша текущая сумма на счету %d$", this.accountNumber, this.balance);
        System.out.println();
    }

}
