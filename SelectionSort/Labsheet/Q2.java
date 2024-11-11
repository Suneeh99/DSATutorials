public class Q2 {
    public static void main(String[] args) {        
        // Initialize an array with unsorted elements
        int arr[] = {5, 6, 3, 2, 10};
        System.out.println("Array in Ascending order");

        // Sort the array in ascending order using selection sort
        for (int i = 0; i < arr.length; i++) {
            // Assume the current index i has the minimum element
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                // Find the index of the smallest element in the unsorted portion of the array
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        // Print the array sorted in ascending order
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sorting in descending order
        System.out.println("\nArray in descending order");

        // Sort the array in descending order using selection sort
        for (int i = 0; i < arr.length; i++) {
            // Assume the current index i has the maximum element
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                // Find the index of the largest element in the unsorted portion of the array
                if (arr[j] > arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found maximum element with the first unsorted element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        // Print the array sorted in descending order
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }   
}
