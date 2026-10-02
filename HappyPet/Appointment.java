package HappyPet;

public class Appointment {
    private String Date;
    private String Time;
    private Boolean isAttended;
    private Boolean isApproved;
    
    public Appointment(String Date, String Time, Boolean isAttended, Boolean isApproved) {
        this.Date = Date;
        this.Time = Time;
        this.isAttended = isAttended;
        this.isApproved = isApproved;
    }

    // Getters
    public String getDate() {
        return Date;
    }

    public String getTime() {
        return Time;
    }

    public Boolean getIsAttended() {
        return isAttended;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    // Other Methods
    public void makeAppointment(){
        
    }
    
    public void cancelAppointment(){
        
    }


    public static void main(String[] args){

    }
}
