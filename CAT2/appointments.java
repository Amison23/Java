public class appointments implements Runnable {
    private String appointment;
    private int time = 5000;
    
    public appointments(String appointment){
        this.appointment = appointment;
    }
    
    @Override
    public void run(){
        try{
            System.out.printf("Appointment processed: %s \n",appointment);
            Thread.sleep(time);
        } 
        catch (InterruptedException e) {
            System.out.printf("The thread was ended prematually due to an error %s",e);
        }
    }
}

