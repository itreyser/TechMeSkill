package lesson8.additionalTask;

public class Main {

    public static void main(String[] args) {
        Patient patient1 = new Patient();
        TreatmentPlan plan = new TreatmentPlan(2);
        patient1.setTreatmentPlan(plan);
        assignTreatment(patient1);
        plan.setNumberOfPlan(5);
        assignTreatment(patient1);

    }

    public static void assignTreatment(Patient patient) {
        if (patient.treatmentPlan().getNumberOfPlan() == 1) {
            Doctor doctor = new Surgeon();
            patient.setDoctor(doctor);
            doctor.treat();

        } else if (patient.treatmentPlan().getNumberOfPlan() == 2) {
            Doctor doctor = new Dentist();
            patient.setDoctor(doctor);
            doctor.treat();
        } else {
            Doctor doctor = new Therapist();
            patient.setDoctor(doctor);
            doctor.treat();
        }
    }
}
