package lesson6.additionalTask;

public class Computer {
    private final int price;
    private final String model;
    private final RAM ram;
    private final HDD hdd;

    public static void main(String[] args) {
        Computer comp1 = new Computer(500, "Asus");
        RAM ram = new RAM("Kingston", 5);
        HDD hdd = new HDD("Toshiba", 1, "внутренний");
        Computer comp2 = new Computer(1000, "Lenovo", ram, hdd);
        comp1.infoComputer();
        comp2.infoComputer();
    }

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
}
