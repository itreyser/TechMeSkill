package lesson8.additionalTask;

public class Surgeon implements Doctor {

    @Override
    public void treat() {
        System.out.println("Вас лечит хирург и план лечения 1");
    }
}
