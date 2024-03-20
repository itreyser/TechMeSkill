package lesson7.secondtask;

public class Main {
    public static void main(String[] args) {
        Person director = new Director();
        director.showPosition();
        Person accountant = new Accountant();
        accountant.showPosition();
        Person worker = new Worker();
        worker.showPosition();
    }
}
