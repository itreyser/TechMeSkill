package lesson6.additionalTask;

public class HDD {
    private String nameHdd;
    private int memory;
    private String type;

    public HDD() {
    }

    public HDD(String nameHdd, int memory, String type) {
        this.nameHdd = nameHdd;
        this.memory = memory;
        this.type = type;
    }


    public void infoHdd() {
        System.out.println("Жесткий диск: " + this.nameHdd + " " + this.memory + "GB" + " " + this.type);
    }


}
