import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {        
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        int n;

        // Loop to ensure valid array length input between 1 and 1000
        while (true) {
            System.out.print("Enter length of the array : ");
            int temp = in.nextInt();
            
            if (1 <= temp && temp <= 1000) {
                // If input is within the valid range, set n to this value and exit loop
                n = temp;
                break;
            }
            System.out.println("Invalid input....");
        }

        // Initialize array with user-defined length
        int arr[] = new int[n];

        // Read array elements from the user
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }

        // Sort the array in ascending order using selection sort
        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;  // Assume the current index has the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                // Update min_idx if a smaller element is found
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the element at index i
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        // Initialize sum variable
        int sum = 0;

        // Print sorted array and calculate the sum of its elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];  // Add each element to sum
        }
        
        // Print the total sum of the array elements
        System.out.println("\nSum is " + sum);
    }
}
