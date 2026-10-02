package Revision.Arrays;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class myArrays {
    public int BinarySearch(int arr[], int i, int r, int x){
        if(r >=1){
            int mid = i + (r - i)/2;
            if(arr[mid] == x)
                return mid;
            
            if(arr[mid] > x)
                return BinarySearch(arr, x, i, mid -1);

            return BinarySearch(arr, x, r, mid + 1);
        }
        return -1;
    }

    public void display(Integer arr[]) {
        System.out.println(Arrays.toString(arr));
    }
    
    
    public Integer[] updateArray(Integer arr[], int x){
        ArrayList<Integer> obj = new ArrayList<>(Arrays.asList(arr)); //change array to list
        try (Scanner scanner = new Scanner(System.in)) {
            x = scanner.nextInt(); // initialise x to accept and store user input
        }
        obj.add(x); // add entered value using .add()
        arr = obj.toArray(arr); // change list to array
        return arr;
        
    }
    public Integer[] removeValue(Integer arr[], int x){
        ArrayList<Integer> obj = new ArrayList<>(Arrays.asList(arr));
        obj.remove(x);
        arr = obj.toArray(arr);
        return arr;
    }

    public static void main(String[] args) {
        Integer[] cars = { 5, 2, 6, 11, 8, 1 };
        // myArrays arrayWork = new myArrays();
        // // arrayWork.sort();
        // arrayWork.removeValue(cars, 1);
        // System.out.println(Arrays.toString(cars));
        ArrayList<Integer> obj = new ArrayList<>(Arrays.asList(cars));
        obj.add(4);
        cars = obj.toArray(cars);
        System.out.println(Arrays.toString(cars));
    }

}