public class person {

    public person(){}

    private String name;
    private int id;
    private String phone;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public void registerUser(){
        System.out.println("user registered");
    }
    public void loginUser(){
        System.out.println("WELCOME user");
    }

    public void examinePatient() {
    }

}
