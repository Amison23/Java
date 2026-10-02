public class administrativeStaff extends Report{
    
    private administrativeStaff(){}

    private int staffId;
    
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String generateReport(String report){
        return report;
    }

}
