package lesson8;

import java.util.Arrays;

public class Phone {
    private String phone;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String phone, String model, double weight) {
        this(phone, model);
        this.weight = weight;

    }

    public Phone(String phone, String model) {
        this.phone = phone;
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phone) {
        System.out.println("Звонит " + name + " с номером " + phone);
    }

    public String getNumber() {
        return phone;
    }

    public void sendMessage(String... phone) {
        System.out.println("Сообщение отправлено на номера: " + Arrays.toString(phone));
    }
}
