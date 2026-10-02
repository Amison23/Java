class ThisDemo {
    private double ssn;
    private String empName;
    private double empAge;

    // getter methods
    public double getEmpSSN(){
        return ssn;
    }
    public String getEmpName(){
        return empName;
    }
    public double getEmpAge(){
        return empAge;
    }

    // setter methods
    public void setEmpSSN(double newValue){
        this.ssn = newValue;
    }
    public void setEmpName(String newName){
        this.empName = newName;
    }
    public void setEmpAge(double newAge){
        this.empAge = newAge;
    }
    public static void main(String[] args){
        ThisDemo obj = new ThisDemo();
        obj.setEmpName("Mario");
        obj.setEmpAge (32.5);
        obj.setEmpSSN(1122.33);
        System.out.println("Employee name: " + obj.getEmpName());
        System.out.println("Employee age: " + obj.getEmpAge());
        System.out.println("Employee serial number: " + obj.getEmpSSN());
    }
}
