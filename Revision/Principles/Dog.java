package Revision.Principles;

public class Dog extends Pet{

    String name;
    int age;
    
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void speak() {
        System.out.println(this.name + " said Bark");
    }
}
