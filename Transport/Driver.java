package Transport;

// Concepts used: Inheritance Constructors
class carClass {
    String carName;
    int carId;
    // constructor for car class
    carClass(String cname, int id) {
        this.carName = cname;
        this.carId = id;
    }
}
// concept used: inheritance 
class Driver extends carClass {
    String driverName;

    Driver(String name, String cname, int id) {
        super(cname, id);
        this.driverName = name;
    }
}

class TransportCompany {
public static void main(String args[]){
    Driver obj = new Driver("Andy" , "Ford", 9988);
    System.out.println(obj.driverName + " is driver of car ID " + obj.carId);
    }
}