# **Recursion: Merge Sort**

Merge Sort is a **Divide and Conquer** algorithm that breaks a problem down into smaller sub-problems, solves those, and then combines them to get the final solution.

#### **Steps in Merge Sort:**

1. **Divide:** Split the problem into smaller parts (in this case, splitting the array into two halves).
2. **Conquer:** Recursively sort each part.
3. **Combine:** Merge the sorted parts together.

#### **Example:**

Starting with the unsorted array:
```
9, 7, 5, 2, 11, 3, 6, 4
```

- **Divide:** Split the array into two parts:
  ```
  9, 7, 5, 2    11, 3, 6, 4
  ```

- **Divide further:**
  ```
  9, 7    5, 2    11, 3    6, 4
  ```

- **Divide until each part is a single element:**
  ```
  9    7    5    2    11    3    6    4
  ```

- **Merge (Conquer):** Combine the elements in sorted order:
  ```
  7, 9    2, 5    3, 11    4, 6
  ```

- **Final Merge:**
  ```
  2, 5, 7, 9    3, 4, 6, 11
  ```

- **Fully Sorted Array:**
  ```
  2, 3, 4, 5, 6, 7, 9, 11
  ```

#### **Merge Sort Code (Java):**
```java
public static void mergeSort(long[] arr, int low, int high){
    if(low == high) {
        return; // Base case: no sorting needed
    } else {
        int mid = (low + high) / 2; // Find midpoint
        mergeSort(arr, low, mid); // Sort left half
        mergeSort(arr, mid + 1, high); // Sort right half
        merge(arr, low, mid + 1, high); // Merge the sorted halves
    }
}
```

#### **The Merge Method (Heart of Merge Sort):**

The merge method is used to combine two sorted arrays into one sorted array.

```java
public static void merge(long[] workspace, int lowPtr, int highPtr, int upperBound){
    int j = 0; // Index for workspace array
    int lowerBound = lowPtr;
    int mid = highPtr;
    while(lowPtr <= mid && highPtr <= upperBound) {
        if(theArray[lowPtr] < theArray[highPtr]) {
            workspace[j++] = theArray[lowPtr++];
        } else {
            workspace[j++] = theArray[highPtr++];
        }
    }
    // Copy remaining elements
    while(lowPtr <= mid) {
        workspace[j++] = theArray[lowPtr++];
    }
    while(highPtr <= upperBound) {
        workspace[j++] = theArray[highPtr++];
    }
    // Copy the sorted data back into the original array
    for(j = 0; j < upperBound - lowerBound + 1; j++) {
        theArray[lowerBound + j] = workspace[j];
    }
}
```
