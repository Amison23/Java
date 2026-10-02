// concepts used: Inheritance
// Output: null, null, physics, teaching

class Teacher{
    String designation;
    String collegeName;
    
    public String getDesignation(){
        return designation;
    }
    protected void setDesignation(String designation){
        this.designation = designation;
    }
    protected String getCollegeName(){
        return collegeName;
    }
    protected void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }
    public void does(){
        System.out.println("Teaching");
    }
}
public class school extends Teacher{
        String mainSubject = "Physics";

        public static void main(String args[]){
    
        school obj = new school();

        System.out.println(obj.getCollegeName());
        System.out.println(obj.getDesignation());
        System.out.println(obj.mainSubject);
        obj.does();
    }
}


