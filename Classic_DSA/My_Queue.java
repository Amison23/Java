package Classic_DSA;

import java.util.LinkedList;
import java.util.Queue;

public class My_Queue {
    public String[] add(String arr[]){
        Queue obj = new LinkedList();
        obj.add(arr);
        return arr;
    }
    public static void main(String[] args){
        Queue myQ = new LinkedList();
    
        myQ.add("name");
        myQ.add("age");
        myQ.add(2);
        
//        myQ.contains(2);
        // System.out.println(myQ.contains(2));

        // System.out.println(myQ);
        myQ.remove("name");
        myQ.remove("age");
        System.out.println("Updated Queue: " + myQ);
        myQ.peek();
        
    }
}
