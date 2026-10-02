public class CAT2 {
    public static void main(String[] args) {
       person obj = new doctor(); 
       person obj1 = new person(); 
       // upcasting which allows us to treat the obj of the doctor class 
       // as an object of the person class
       // However, we can't have access to any of the doctor methods, 
       // only methods within person are availble

       useSystem(obj);  // output: Welcome Doctor
       useSystem(obj1); // output: Welcome user

    }
    // we use this method to call method person. we can send any subtype of
    // person as a result of this which is done on line 9
    // Upcasting allows us now to operate on any type of class that 
    // uses the system and make a method to useSystem() the user in each of them
    public static void useSystem(person Person){
        Person.loginUser();
    }
}
