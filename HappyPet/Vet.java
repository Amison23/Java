package HappyPet;

public class Vet {
    private String name;
    private String specialization;
    
    public Vet(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecialization() {
        return this.specialization;
    }
    
    public static void main(String[] args){
        Vet a = new Vet("John Doe", "Dermatology");
        
        System.out.println(a.name + ", Speciality: " + a.specialization);
    }
}
