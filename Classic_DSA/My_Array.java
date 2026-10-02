package Classic_DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class My_Array {

    public int searchArray(Integer myAge[], int myage){
        int myLocation = 0;
        for(int i = 0; i < myAge.length; i++){
            if (myAge[i] == myage) {
                System.out.println(i);
                myLocation = i;
            }
        }
        return myLocation;
    }

    public Integer[] updateArray(Integer arr[], int element){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        arrayList.add(element);
        arr = arrayList.toArray(arr);
        return arr;
    }

    public Integer[] removeArray(Integer arr[], int element){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        arrayList.remove(element);
        arr = arrayList.toArray(arr);
        return arr;
    }

    public My_Array(){
        
    }

    public static void main(String[] args){
        Integer [] myAge = {12,25,31,40,5};
        System.out.println("Initial Array: " + Arrays.toString(myAge));

        //convert array to List then use add() to add new age then convert it back to an array

        //creating array list
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(myAge));
        //adding new element
        arrayList.add(3);
        //changing arrayList back to an Array
        myAge = arrayList.toArray(myAge);

        // System.out.println("modified Array: " + Arrays.toString(myAge));
// **************************************************************************************************************************
        // **Sorting the array**
        Arrays.sort(myAge);
        // System.out.println("Sorted Array: " + Arrays.toString(myAge));

        // SEARCH ALGORTHMS
        // **Linear search** without changing array to list:
        // int toCheckValue = 43;
        // check(myAge, toCheckValue);

        // Check for value position
        // for (int i = 0; i < myAge.length; i++) {
        //     if(myAge[i] == 40){
        //     System.out.println("Position of Number: " + i);
        //     }
        // }

        My_Array search = new My_Array();
        search.searchArray(myAge, 23);
        search.updateArray(myAge, 39);
        System.out.println(Arrays.toString(myAge));
    }
}
