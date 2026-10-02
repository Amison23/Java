public class Student {

    private String Name;
    private int Id;
    private int StudId;

    // Constructor
    public Student() {

    }
    //Polymorphism
    public void Role(){
        System.out.println("Lecturer");
    }

    // Getters and Setters
    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    public int getStudId() {
        return StudId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setStudId(int studId) {
        StudId = studId;
    }

    public class Lecturer extends Student{
        public void Role(){
            System.out.println("Lecturer");
        }
    }
    
    public static void main(String[] args) {

    }
}
