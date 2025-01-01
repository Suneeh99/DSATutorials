import java.util.Scanner;

public class BubbleSort {

    // Method to sort the array in both ascending and descending order using Bubble Sort
    public static void bubbleSort(int arr[]) {
        System.out.print("Ascending Sorted array : { ");

        // Bubble Sort for Ascending Order
        for (int i = 0; i < arr.length - 1; i++) {
            // Loop through the array up to the sorted section
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the array sorted in ascending order
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");

        System.out.print("Descending Sorted array : { ");

        // Bubble Sort for Descending Order
        for (int i = 0; i < arr.length - 1; i++) {
            // Loop through the array up to the sorted section
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Swap if the current element is less than the next element
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the array sorted in descending order
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int arr[] = new int[8];  // Initialize an array with space for 8 elements
        int len = arr.length;
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter elements for the array
        for (int i = 0; i < len; i++) {
            System.out.print("Enter a value : ");
            arr[i] = in.nextInt();
        }

        // Sort and print the array in both ascending and descending order
        bubbleSort(arr);
    }
}
