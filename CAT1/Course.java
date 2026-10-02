
public class Course extends Student{
    private String course;
    private int units;
    private String tutor;
    private int StudId;
    private int AvgGrade;

    public Course(){

    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    
    public int getAvgGrade(){
        return AvgGrade;
    }
    public void setAvgGrade(int AvgGrade){
        this.AvgGrade = AvgGrade; 
    }
    @Override
    public int getStudId() {
        return StudId;
    }

    @Override
    public void setStudId(int studId) {
        StudId = studId;
    }


    // other methods
    public void Checkgrades(int AvgGrade){
        if(AvgGrade <= 40){
            System.out.println("Not doing good, pull up your socks " + AvgGrade);
        }
        else{
            System.out.println("Doing well "+ AvgGrade);
        }
        
    }

}
