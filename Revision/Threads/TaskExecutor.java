package Revision.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
    public static void main(String[] args) {
        PrintTask task1 = new PrintTask("Task 1");
        PrintTask task2 = new PrintTask("Task 2");
        PrintTask task3 = new PrintTask("Task 3");
        PrintTask task4 = new PrintTask("Task 4");
        PrintTask task5 = new PrintTask("Task 5");
        PrintTask task6 = new PrintTask("Task 6");

        System.out.println("Starting Executor");

        ExecutorService threadExecutor = Executors.newFixedThreadPool(2);

        threadExecutor.execute(task1);
        threadExecutor.execute(task2);
        threadExecutor.execute(task3);
        threadExecutor.execute(task4);
        threadExecutor.execute(task5);
        threadExecutor.execute(task6);

        threadExecutor.shutdown();
        System.out.println("Tasks started, main ends. \n");
    }
}
