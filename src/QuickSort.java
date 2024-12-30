class QuickSort {
    public static void main(String[] args) {
        int num[] = { 5, 1, 6, 3, 2, 7 };

        System.out.println("Unsorted Array:");
        for (int nums : num) {
            System.out.print(nums + " ");
        }

        quickSort(num, 0, num.length - 1);
        System.out.println("Sorted Array:");
        printArray(num);
    }


    private static void quickSort(int[] num, int low, int high) {

        if (low < high) {
            int partitionIndex = Partition(num, low, high);
            quickSort(num, low, partitionIndex - 1);
            quickSort(num, partitionIndex + 1, high);
        }
    }


    private static int Partition(int[] num, int low, int high) {
        int pivot = num[high];  // Pivot is the last element (7) 
        int i = low - 1;        // i starts at -1 before the first element
        
        for (int j = low; j < high; j++) {    // Loop over all elements except the pivot (j = 0 to j = 4)
            if (num[j] <= pivot) {            // Compare current element with pivot (7)
                                               // 5 <= 7 true          1 <= 7 true        6 <= 7 true         3 <= 7 true       2 <= 7 true
                i++;                          // Increment i          i = 0              i = 1               i = 2             i = 3          i = 4
                int temp = num[i];            // Swap elements at i and j. Since i and j are the same in each case so far, no visible swap occurs:
                                               // num[0] = num[0]     num[1] = num[1]    num[2] = num[2]     num[3] = num[3]   num[4] = num[4] 
                num[i] = num[j];              // (No actual changes in array as i == j in all cases)
                num[j] = temp;                // (Same value at i and j so array looks unchanged)
            }
        }
        
        int temp = num[i + 1];                // After the loop, we swap the element at i+1 (index 5) with the pivot at the last position
        num[i + 1] = num[high];               // This positions the pivot (7) at the correct sorted position (index 5)
        num[high] = temp;                     // Since i + 1 == high, no visible change (7 swaps with itself)
        
        return i + 1;                         // Return the partition index (5)
    }
    

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}