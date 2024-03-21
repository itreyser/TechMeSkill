package lesson6.additionalTask;

public class Computer {
    private int price;
    private String model;
    private RAM ram;
    private HDD hdd;


    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void infoComputer() {
        System.out.println("Информация по компьютеру " + this.model + ": Цена " + this.price + "$");
        this.ram.infoRam();
        this.hdd.infoHdd();
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
