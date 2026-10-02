package SortAlgorithms;
 

class StoogeSort {
    // known as a less effecient algo
    // due to alot of iterations because of alot of divisions
    static void stoogeSort(int arr[], int first, int last){
        if (last <= first) {
            return;
        }

        if (arr[first] > arr[last]) {
            int c = arr[first];
            arr[first] = arr[last];
            arr[last] = c;
        }

        // diving the array into 2/3rd's
        if(last - first + 1 > 2){
            int c = (last - first + 1) / 3;

            stoogeSort(arr, first, last - c);
            stoogeSort(arr, first + last, last);
            stoogeSort(arr, first, last - first);
        }

    }

    public static void main(String[] args) {
        int arr[] = {23,3,10,1,50,6};
        int n = arr.length;

        stoogeSort(arr, 1, n-1);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    

}
