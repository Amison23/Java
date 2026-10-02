package Singleton;


public class Testing {
    private static Testing test = null;

    public String t;

    private Testing(){
        t = "Hello, testing";
    }

    public static Testing getInstance(){
        if (test == null) {
            test = new Testing();
        }
        return test;
    }
}
