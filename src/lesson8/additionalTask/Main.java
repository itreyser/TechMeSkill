package lesson8.additionalTask;

public class Main {

    public static void main(String[] args) {
        Patient patient1 = new Patient(NumberOfTreat.PLAN1);
        Patient patient2 = new Patient(NumberOfTreat.PLAN2);
        Patient patient3 = new Patient(NumberOfTreat.OTHER);
        assignTreatment(patient3);
        assignTreatment(patient2);
        assignTreatment(patient1);

    }

    public static void assignTreatment(Patient patient) {
        if (patient.planOfTreat == NumberOfTreat.PLAN1) {
            Doctor surgeon = new Doctor() {
                @Override
                public void treat() {
                    System.out.println("Вас лечит хирург и план лечения 1");
                }
            };
            patient.doctor = surgeon;
            surgeon.treat();
        } else if (patient.planOfTreat == NumberOfTreat.PLAN2) {
            Doctor dentist = new Doctor() {
                @Override
                public void treat() {
                    System.out.println("Вас лечит дантист и план лечения 2");
                }
            };
            patient.doctor = dentist;
            dentist.treat();
        } else {
            Doctor therapist = new Doctor() {
                @Override
                public void treat() {
                    System.out.println("Вас лечит терапевт и план лечения общий");
                }
            };
            patient.doctor = therapist;
            therapist.treat();
        }
    }
}
