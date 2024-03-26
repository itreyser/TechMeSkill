package lesson8;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("375292132772", "Samsung");
        Phone phone3 = new Phone("375292130000", "Apple", 205.20);

        phone1.receiveCall("Анна");
        System.out.println("Номер телефона: " + phone1.getNumber());

        phone2.receiveCall("Петр");
        System.out.println("Номер телефона: " + phone2.getNumber());

        phone3.receiveCall("Мария");
        System.out.println("Номер телефона: " + phone3.getNumber());

        phone1.receiveCall("Никита", "375443452333");
        phone1.sendMessage("375292132772", "375292132773", "375292332772", "375292122772", "375292132172");
    }
}
