package Lab1_2;

public class Owner {
    public String name;
    public double ownwersId;
    public Boolean type;
    public int age;
    public int properties;
    
    public Owner(){

    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setOwnwersId(double ownwersId) {
        this.ownwersId = ownwersId;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProperties(int properties) {
        this.properties = properties;
    }

    public void New_Assign(){

    }

    public void setDetails(){
        
    }

    // getter Method to fetch owner properties
    public int getProperties(float ownersId){
        return properties;
    }
}
