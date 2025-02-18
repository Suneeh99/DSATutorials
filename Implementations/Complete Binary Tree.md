
# Complete binary tree implementation

1. Every level, except possibly the last, is completely filled.
2. All nodes are as far left as possible

---

```
import java.util.Scanner;

public class CompleteBinaryTree{
	private int[] tree;
	private int size;
	
	public void insert(int capacity){
		tree = new int[capacity];
		size = 0;
	}
	
	// Add node to binary tree
	public void insert(int value){
		if(size == tree.length){
			throw new illegalStateException("Tree is full");
		}
		tree[size] = value;
		size++;
	}
	
	// Get the value of the root node
	public int getRoot(){
		if(size == 0){
			throw new illegalStateException("Tree is empty");
		}
		return tree[0];
	}
	
	// Get the left child of a node at index i
	public the getLeftChild(int i){
		int leftIndex = 2 * i + 1;
		if(leftIndex >= size){
			throw new IllegalStateException("No Left Child");
		}
		return tree[leftIndex];
	}
	
	// Get the right child of a node at index
	public int getRightChild(int i){
		int rightIndex = 2 * i + 2;
		if(rightIndex >= size){
			throw new IllegalStateException("No RIght Child");
		}
		return tree[rightIndex];
	}
	
	// Get the parent of a node at index
	public int getParent(int i){
		if(i == 0){
			throw new IllegalStateException("Root node has no parent");
		}
		int parentIndex = (i - 1) / 2;
		return tree[parentIndex];
	}
	
	// Display the binary tree as an array using deepToString
	public void display(){
		System.out.println(Arrays.toString(Arrays.copyOf(tree.size)));
	}

	// Delete a node from the binary tee
	public void delete(int value){
		int index = search(value);
		if(index == -1){
			throw new IllegalStateException("Value not found in the tree");
		}
		// replace the node to delete with the last node
		tree[index] = tree[size-1];
		size--;
	}
	
	// Search for a specific node and return its index
	public int search(int value){
		for(int i 0; i < size; i++){
			if(tree[i] == value){
				return i;
			}
		}
		return -1;
	}
	
	// Get the value of specific node
	public int getNodeValue(int value){
		int index = search(value);
		
	}
}
```


---

## Quick Sort : Recursion

Apply divide and conquer method
- Divide
- Conquer


Steps
- find pivot that divides the array into two halves
- quick sort the left half
- quick sort the right half

choosing pivot elemtent

- right most value
- left most value
- random value

partioning of array
- initializing
- iterate through the array
- final swap

