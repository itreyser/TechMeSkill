package lesson6.additionalTask;

public class RAM {
    private String nameHdd;
    private int memory;

    public RAM() {
    }

    public RAM(String nameHdd, int memory) {
        this.nameHdd = nameHdd;
        this.memory = memory;
    }


    public void infoRam() {
        System.out.println("Оперативная память: " + this.nameHdd + " " + this.memory + " ГБ");
    }
}
