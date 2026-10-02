package Revision.SearchAlgorithms;

class Binary_Search {
    // Returns index of x if it is present in arr[l, r], else return -1
    int binarySearch(int arr[], int i, int r, int x){
        if(r >= 1){
            int mid = i + (r - i)/2;
            // If the element is present at the middle itself
            if(arr[mid] == x)
                return mid;
        
            // If element is smaller that mid, 
            // then it can only be present in left subarray
            if(arr[mid] > x)
                return binarySearch(arr, i, mid - 1, x);
                
            // Else the element can only be present
            // in right Subarray
            return binarySearch(arr, mid + 1, r, x);
        }
        // When element isn't present, we return -1
        return -1;
    }


    public static void main(String[] args) {
        Binary_Search obj = new Binary_Search();
        int arr[] = {2,3,5,6,7,8,9};

        int n = arr.length;
        int x = 9;

        int result = obj.binarySearch(arr, 0, n-1, x);

        if(result == -1){
            System.out.println("Element doesn't exist");
        }
        else{
            System.out.println("Element found at index " + result);
        }
    }
}
