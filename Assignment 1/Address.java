// Concepts used: classes, objects, constructors and composition

public class Address{
    double streetNum;
    String city;
    String state;
    String country;
    Address(double street, String c, String st, String coun){
        this.streetNum = street;
        this.city = c;
        this.state = st;
        this.country = coun;
    }
}
class StudentClass{
    double rollNum;
    String studentName;
    Address studentAddr;
    StudentClass(double roll, String name, Address ad){
        this.rollNum = roll;
        this.studentName = name;
        this.studentAddr = ad;
    }   
    public static void main(String args[]){
        Address ad = new Address(55.65, "Agra", "UP", "India");
        StudentClass obj = new StudentClass(123.5, "Chaitanya", ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
    }
}


