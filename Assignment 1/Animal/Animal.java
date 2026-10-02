package Animal;

public class Animal {
    public void sound(){
        System.out.println("Animal is making a sound "/* + sound*/ );
    }
    public static void main(String[] args){
        Cat mypet = new Cat();
        Horse pet = new Horse();
        mypet.sound();
        pet.sound();
    }
}

