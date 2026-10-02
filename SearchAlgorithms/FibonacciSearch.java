package SearchAlgorithms;

class FibonacciSearch {
    public static int min(int x, int y) {
        return (x <= y) ? x : y;
    }

    public static int fibMonaccianSearch(int arr[], int x, int n) {
        int fibNo2 = 0; 
        int fibNo1 = 1; 
        int fibNo = fibNo2 + fibNo1; 

        while (fibNo < n) {
            fibNo2 = fibNo1;
            fibNo1 = fibNo;
            fibNo = fibNo2 + fibNo1;
        }

        int offset = -1;

        while (fibNo > 1) {
            int i = min(offset + fibNo2, n - 1);
            if (arr[i] < x) {
                fibNo = fibNo1;
                fibNo1 = fibNo2;
                fibNo2 = fibNo - fibNo1;
                offset = i;
            }

            else if (arr[i] > x) {
                fibNo = fibNo2;
                fibNo1 = fibNo1 - fibNo2;
                fibNo2 = fibNo - fibNo1;
            }
            else
                return i;
        }

        if (fibNo1 == 1 && arr[n - 1] == x)
            return n - 1;
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100, 235 };
        int n = 12;
        int x = 235;
        int ind = fibMonaccianSearch(arr, x, n);
        if (ind >= 0)
            System.out.print("Found at index: "+ ind);
        else
            System.out.print(x + " isn't present in the array");
    }
}
