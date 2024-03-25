package lesson8.additionalTask;

public class Patient {
    private Doctor doctor;
    private TreatmentPlan treatmentPlan;

    public Patient() {
    }

    public Patient(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public TreatmentPlan treatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
