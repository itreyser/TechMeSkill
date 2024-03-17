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

    public void withdrawCard(int sum) {
        if (this.balance >= sum) {
            this.balance -= sum;
        } else {
            System.out.printf("На счету %d недостаточно средств", this.accountNumber);
            System.out.println();
        }
    }

    public void cardInfo() {
        System.out.printf("Ваш номер счета - %d, ваша текущая сумма на счету %d$", this.accountNumber, this.balance);
        System.out.println();
    }

}
