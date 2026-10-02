import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class receptionistAppointment {
     public static void main(String[] args) {

        String[] appointments = {"slot 1", "slot 2", "slot 3", "slot 4", "slot 5"};

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for (String appointment : appointments) {
            appointments processor = new appointments(appointment);
            executorService.execute(processor);
        }
        executorService.shutdown();
    }

    
}
