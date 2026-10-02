package Singleton;
public class Singleton {
    private static Singleton single_instance = null;

    public String s;
    public int test[];


    private Singleton(){
        int test[] = {1,2,3};
        for (int i = 0; i < test.length; i++) {
            if (i == 3) {
                System.out.println("test complete");
            }
        }
        s = "Hello, I am a String part of singleton";
    }

    public static Singleton getInstance(){
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
    
}
