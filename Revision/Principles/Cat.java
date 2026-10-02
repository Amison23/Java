package Revision.Principles;

public class Cat extends Pet{

    String name;
    int age;
    
    public Cat(String name, int age){
        this.name= name;
        this.age = age;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void speak() {
        System.out.println(this.name + " said Meooww");
    }
}
