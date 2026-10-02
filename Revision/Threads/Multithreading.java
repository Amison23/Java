package Revision.Threads;

public class Multithreading implements Runnable {

    @Override
    public void run() {
        String db = "John_Kuria_Kehancha_8";

        String[] tokens = db.split("_");

        try {
            Thread.sleep(3000);
            // System.out.println("The head of the family is " + tokens[0] + " of " + tokens[1] + " tribe from " + tokens[2]
            //     + " and has " + tokens[3] + " dependants");

            System.out.printf("The head of the family is %s of %s tribe from %s and has %s dependants", tokens);
        } catch (Exception e) {}
    }
}
