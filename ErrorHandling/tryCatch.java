package ErrorHandling;

public class tryCatch {
    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("pants");
        } catch (Exception e) {
            System.out.println("Can't make int out of that");
        }
    }
}
