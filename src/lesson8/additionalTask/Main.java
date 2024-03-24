package lesson8.additionalTask;

public class Main {

    public static void main(String[] args) {
        Patient patient1 = new Patient(new TreatmentPlan(2));
        TreatmentPlan plan = new TreatmentPlan(2);
        patient1.setTreatmentPlan(plan);
        assignTreatment(patient1);
        plan.setNumberOfPlan(5);
        assignTreatment(patient1);

    }

    public static void assignTreatment(Patient patient) {
        if (patient.treatmentPlan().getNumberOfPlan() == 1) {
            Doctor surgeon = new Doctor() {
                @Override
                public void treat() {
                    System.out.println("Вас лечит хирург и план лечения 1");
                }
            };
            patient.setDoctor(surgeon);
            surgeon.treat();
        } else if (patient.treatmentPlan().getNumberOfPlan() == 2) {
            Doctor dentist = new Doctor() {
                @Override
                public void treat() {
                    System.out.println("Вас лечит дантист и план лечения 2");
                }
            };
            patient.setDoctor(dentist);
            dentist.treat();
        } else {
            Doctor therapist = new Doctor() {
                @Override
                public void treat() {
                    System.out.println("Вас лечит терапевт и план лечения общий");
                }
            };
            patient.setDoctor(therapist);
            therapist.treat();
        }
    }
}
