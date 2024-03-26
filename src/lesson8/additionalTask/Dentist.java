package lesson8.additionalTask;

public class Dentist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Вас лечит дантист и план лечения 2");
    }
}
