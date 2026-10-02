package Animal;

public class Horse extends Animal{
    @Override
    public void sound(){
        super.sound();
        System.out.println("Neigh");
    }
}