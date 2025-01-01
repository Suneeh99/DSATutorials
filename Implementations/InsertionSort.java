public class InsertionSort {
    // Insertion sort using swap-based method
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            // Shift elements that are greater than arr[j] to one position ahead
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;  // Move to the previous element
            }
        }
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    // Optimized insertion sort using shifting (no unnecessary swaps)
    public static void insertionSortOP(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // Store the element to be inserted
            int j = i - 1;

            // Shift elements of arr[0...i-1] that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;  // Insert key at its correct position
        }
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    // Insertion sort in descending order
    public static void insertSortDesc(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // Store the element to be inserted
            int j = i - 1;

            // Shift elements of arr[0...i-1] that are smaller than key to one position ahead
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;  // Insert key at its correct position
        }
        // Print the sorted array in descending order
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    // Main method to test the sorting methods
    public static void main(String[] args) {
        int arr[] = {4, 5, 8, 7, 1};

        // Sorting using swap-based insertion sort
        System.out.println("Swap method: ");
        insertionSort(arr);   

        // Sorting using optimized insertion sort with shifting
        System.out.println("\nReplaced method: ");
        insertionSortOP(arr);

        // Sorting in descending order
        System.out.println("\nDescending array: ");
        insertSortDesc(arr);

        System.out.println("");  // New line for clarity
    }
}
