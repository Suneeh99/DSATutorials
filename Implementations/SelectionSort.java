public class SelectionSortExample {
    public static void main(String[] args) {
        // Initialize an array with unsorted elements
        int arr[] = {5, 3, 6, 7, 1, 2};
        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Assume the current index i is the minimum
            int min_idx = i;
            // Find the index of the smallest element in the unsorted part of the array
            for (int j = i + 1; j < arr.length; j++) { // Corrected `arr.length-1` to `arr.length`
                if (arr[j] < arr[min_idx]) {
                    // Update min_idx if a smaller element is found
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            swap(arr, min_idx, i); // Corrected to pass the array and indices for swapping
        }
        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    // Swap method to exchange elements in the array
    public static void swap(int[] arr, int index1, int index2) { // Updated to take the array and indices
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
