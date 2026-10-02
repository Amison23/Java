package Arrays;

import java.util.Arrays;
import java.util.ArrayList;

public class My_Arrays {
    public int searchArray(Integer arr[], int scores){
        int myLocation = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == scores) {
                System.out.println(i);
                myLocation = i;
            }
        }
        return myLocation;
    }

    public Integer[] removeScore(Integer arr[], int score){
        ArrayList<Integer> performance = new ArrayList<>(Arrays.asList(arr));
        performance.remove(score);
        arr = performance.toArray(arr);
        return arr;
    }

    public Integer[] updateScore(Integer arr[], int score){
        ArrayList<Integer> performance = new ArrayList<>(Arrays.asList(arr));
        performance.add(score);
        arr = performance.toArray(arr);
        return arr;
    }

    public void display(Integer arr[]){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5,6,7,8,9}; 
        //changing the array to a list
        ArrayList<Integer> performace = new ArrayList<>(Arrays.asList(arr));
        // add another value
        performace.add(11);
        //change back to array
        arr = performace.toArray(arr);

        // printing as a String and not object
        // System.out.println(Arrays.toString(arr));

        // running the search DSA
        My_Arrays find = new My_Arrays();
        find.searchArray(arr, 5);
        find.removeScore(arr, 5);
        find.updateScore(arr, 80);
        System.out.println(Arrays.toString(arr));

    }
}
