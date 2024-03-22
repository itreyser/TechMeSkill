package lesson6;

public class Main {
    public static void main(String[] args) {
        CreditCard account1 = new CreditCard(111111, 50_000);
        CreditCard account2 = new CreditCard(222222, 10_000);
        CreditCard account3 = new CreditCard(333333, 30_000);
        account1.replenishmentCard(333);
        account2.replenishmentCard(10000);
        account3.withdrawCard(5000);
        account1.cardInfo();
        account2.cardInfo();
        account3.cardInfo();
    }
}
