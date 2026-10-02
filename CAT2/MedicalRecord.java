public class MedicalRecord {
    private static MedicalRecord medical_instance = null;
    private String medicalHistory = "";
    private String treatmentPlan = "";

    private MedicalRecord(){
        
    }

    public void updateMedicalHistory(String history){
        this.medicalHistory = history;
    }
    public void updateTreatmentPlan(String treatment){
        this.treatmentPlan = treatment;
    }
    
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public static MedicalRecord getInstance(){
        if (medical_instance == null) {
            medical_instance = new MedicalRecord();
        }
        return medical_instance;
    }
}

// class for threads that has try catch
// try will implement the 
// catch will 