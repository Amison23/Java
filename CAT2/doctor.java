public class doctor extends person{
    
    doctor(){}

    private String experience;
    private String specialisation;


    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    @Override 
    public void loginUser(){
        System.out.println("WELCOME Doctor");
    }

    public void examinePatient(){
        System.out.println("patient examined");
    }

}
