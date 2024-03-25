package lesson8.additionalTask;

public class Therapist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Вас лечит терапевт и план лечения общий");
    }
}
