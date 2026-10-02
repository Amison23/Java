package SortAlgorithms;

class SelectionSort {
    void sort(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int mid_index = i;
            for(int j = i+1; j < n; j++)
                if(arr[j] < arr[mid_index])
                    mid_index = j;
            int temp = arr[mid_index];
            arr[mid_index] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) 
            System.out.println(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        obj.sort(arr);
        System.out.println("Sorted Array");
        obj.printArray(arr);
    }
}
