public class Report {
    
    private int reportId;
    private String reportType;
    private int patientsTreated;
    private int patientsInCareSystem;
    private int sectionedPatients;
    private int costs;
    private String drugsPrescribed;

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public int getPatientsTreated() {
        return patientsTreated;
    }

    public void setPatientsTreated(int patientsTreated) {
        this.patientsTreated = patientsTreated;
    }

    public int getPatientsInCareSystem() {
        return patientsInCareSystem;
    }

    public void setPatientsInCareSystem(int patientsInCareSystem) {
        this.patientsInCareSystem = patientsInCareSystem;
    }

    public int getSectionedPatients() {
        return sectionedPatients;
    }

    public void setSectionedPatients(int sectionedPatients) {
        this.sectionedPatients = sectionedPatients;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public String getDrugsPrescribed() {
        return drugsPrescribed;
    }

    public void setDrugsPrescribed(String drugsPrescribed) {
        this.drugsPrescribed = drugsPrescribed;
    }


    public String generateMonthlyReport(String report){
        return report;
    }
}
