import java.util.LinkedList;
import java.util.Queue;


public class findReport {
    public int find_report(Queue patient, String reportId){
        String[] my_report = (String[]) patient.toArray(new String[0]);
        
        int i = 0;
        int r = my_report.length - 1;
            
        while(i <= r) {
            int m  = i + ( r - 1) /2;
            int res = reportId.compareTo(my_report[m]);
            
            if(res == 0)
                return m;
            
            if(res > 0)
                i = m + 1;
            
            else
                r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Queue<String> patient = new LinkedList<>();
        // adding patient records assuming we have retrived from DB
        patient.add("001");
        patient.add("002");
        patient.add("003");
       
        System.out.println("Current Patient Queue:");
        System.out.println(patient);
        
        findReport obj = new findReport();

        // finding report Id
        int result = obj.find_report(patient, "004");
        if (result == -1) {
            System.out.println("Not found");
        }
        else{
            System.out.printf("Element found at: %s \n",result);
        }

    }
}
