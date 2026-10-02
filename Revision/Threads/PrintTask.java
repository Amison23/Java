package Revision.Threads;

import java.util.Random;

public class PrintTask implements Runnable{
    private final int sleepTime;
    private final String taskName;
    private final static Random generator = new Random();

    public PrintTask(String name){ //constructor
        taskName = name;
        sleepTime = generator.nextInt(9000);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sleepTime);
            System.out.printf("%s going to sleep for %d ms. \n", taskName, sleepTime); 
        } catch (InterruptedException e) {
            System.out.printf("%s %s \n", taskName, "terminated prematurely due to interuption");
        }
        System.out.printf("%s done sleeping\n", taskName);
    }
}
