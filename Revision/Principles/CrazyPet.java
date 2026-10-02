package Revision.Principles;

import java.util.Random;

public class CrazyPet extends Pet{

    Random rnd = new Random();
    
    @Override
    public String getName() {
        String name = "";
        char[] chars = "A-Za-z0-9/!@#$%^&*()_+=-`~{}:<>,.".toCharArray();  
        for(int i = 0; i < 7; i++){
            name += chars[rnd.nextInt(chars.length)];
        }
        return name;
    }

    @Override
    public int getAge() {
        return rnd.nextInt(40);
    }

    @Override
    public void speak() {
        String text = "";
        char[] chars = "A-Za-z0-9/!@#$%^&*()_+=-`~{}:<>,.".toCharArray();  
        for(int i = 0; i < 7; i++){
            text += chars[rnd.nextInt(chars.length)];
        }
        System.out.println(this.getName()+ " said "+text);
    }
    
}
