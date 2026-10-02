package Revision.StringPre_Processing;

public class StringConstructors {
    public static void main(String[] args) {
        // char[] text = {'b','i','r','t','h',' ','d','a','y'};
        // String s = new String("hello");
        // String s1 = new String("");

        // System.out.println(s.compareTo(s1));
        // // String s1 = new String();
        // String s2 = new String(s);
        // String s3 = new String(text);
        // String s4 = new String(text, 0, 9);

        
        // System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", s1,s2,s3,s4);

        String db = "John_Kuria_Kehancha_8";

        String[] tokens = db.split("_");

        // for(String token : tokens)
        //     System.out.println(token);
        // System.out.println(tokens[0]);
        String name =  tokens[0];
        System.out.println("The head of the family is " + name+ " of "+tokens[1]+" tribe from "+tokens[2]+" and has "+tokens[3]+" dependants");
        
    }
}
