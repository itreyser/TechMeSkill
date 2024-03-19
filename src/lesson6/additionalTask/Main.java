package lesson6.additionalTask;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer(500, "Asus");
        RAM ram = new RAM("Kingston", 5);
        HDD hdd = new HDD("Toshiba", 1, "внутренний");
        Computer comp2 = new Computer(1000, "Lenovo", ram, hdd);
        comp1.infoComputer();
        comp2.infoComputer();
    }
}
