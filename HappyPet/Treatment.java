package HappyPet;

public final class Treatment{
    private final int Treatment_ID;
    private final String Date_Prescribed;
    private final String Appointment_Date_Time;
    private final String Treatment_type;
    private final String Notes;
    private final int cost;
    private final String Treatment_Date;

    // Constructor
    public Treatment(int Treatment_ID, String Date_Prescribed, String Appointment_Date_Time, String Treatment_type, String Notes, int cost, String Treatment_Date) {
        this.Treatment_ID = Treatment_ID;
        this.Date_Prescribed = Date_Prescribed;
        this.Appointment_Date_Time = Appointment_Date_Time;
        this.Treatment_type = Treatment_type;
        this.Notes = Notes;
        this.cost = cost;
        this.Treatment_Date = Treatment_Date;
    }

    // Getters
    public int getTreatment_ID() {
        return Treatment_ID;
    }

    public String getDate_Prescribed() {
        return Date_Prescribed;
    }

    public String getAppointment_Date_Time() {
        return Appointment_Date_Time;
    }

    public String getTreatment_type() {
        return Treatment_type;
    }

    public String getNotes() {
        return Notes;
    }

    public int getCost() {
        return cost;
    }

    public String getTreatment_Date() {
        return Treatment_Date;
    }
    
    public void giveTreatment(){
        
    }
    
    // Main Method
    public static void main(String[] args){
        Treatment patient = new Treatment(
            01, 
            "9/3/2022", 
            "12/4/2022", 
            "checkup", 
            "In good condition", 
            5000, 
            "5/2/2023");

            System.out.println(patient.Appointment_Date_Time + " " + patient.Treatment_ID);
    }
}
