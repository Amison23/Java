package SearchAlgorithms;

class LinearSearch {
    // This function returns index of element
    public int search(int arr[], int x){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // Return the index of the element is found
            if(arr[i] == x){return i;}
        }
        // Return -1 if element isn't found
        return -1;
    }

    public static void main(String[] args){
        LinearSearch obj = new LinearSearch();
        int arr[] = {64,25,12,22,11};

        System.out.println(obj.search(arr, 11));
        
    }
}

