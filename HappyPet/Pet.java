package HappyPet;

public final class Pet {
    private final String name;
    private final String type;
    private final String DOB;
    private final String Reg_Date;

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getDOB() {
        return this.DOB;
    }

    public String getReg_Date() {
        return this.Reg_Date;
    }
    
    // constructor to initialise values
    public Pet(String name, String type, String DOB, String Reg_Date){
        this.name = name;
        this.type = type;
        this.DOB = DOB;
        this.Reg_Date = Reg_Date;
    }
    
    public static void main(String[] args){
        Pet animal = new Pet("Rosco", 
        "BullDog", 
        "1/1/2022", 
        "14/4/2022"
        );

        System.out.println(animal.name + " " + animal.type);
    }
}
