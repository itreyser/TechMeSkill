package lesson6.additionalTask;

public class RAM {
    private String nameHdd;
    private int memory;

    public RAM(String nameHdd, int memory) {
        this.nameHdd = nameHdd;
        this.memory = memory;
    }

    public RAM() {
    }

    public void infoRam() {
        System.out.println("Оперативная память: " + this.nameHdd + " " + this.memory + " ГБ");
    }
}
