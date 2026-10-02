package Revision.Principles;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Snuffles", 4);
        Cat myCat = new Cat("Penzi", 3);
        CrazyPet crazyPet = new CrazyPet();

        myDog.speak();
        myCat.speak();
        crazyPet.speak();

        Dog dog = new Dog(null, 0);
        Pet cast = (Pet) Dog();
        // Person person = new Person("Victor");
        // Person person2 = new Person("Tim");

        // person.setPet(myCat);
        // person2.setPet(myDog);

        // System.out.println(person.getName() + " has a pet named " + person.getPet().getName()+ " which is " + person.getPet().getAge()+" years old");

    }

    private static Pet Dog() {
        return null;
    }
}
