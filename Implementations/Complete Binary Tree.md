# **Complete Binary Tree Explanation**

A **complete binary tree** is a type of binary tree where:
1. Every level, except possibly the last, is completely filled.
2. All nodes are as far left as possible.

This is important because it ensures that the tree is as compact as possible.

### **Java Code for Complete Binary Tree**

```java
import java.util.Arrays;

public class CompleteBinaryTree {
    private int[] tree;
    private int size;
    
    // Initialize the binary tree with a specific capacity
    public void insert(int capacity) {
        tree = new int[capacity];
        size = 0;
    }
    
    // Add node to binary tree
    public void insert(int value) {
        if (size == tree.length) {
            throw new IllegalStateException("Tree is full");
        }
        tree[size] = value;
        size++;
    }
    
    // Get the value of the root node
    public int getRoot() {
        if (size == 0) {
            throw new IllegalStateException("Tree is empty");
        }
        return tree[0];
    }
    
    // Get the left child of a node at index i
    public int getLeftChild(int i) {
        int leftIndex = 2 * i + 1;
        if (leftIndex >= size) {
            throw new IllegalStateException("No Left Child");
        }
        return tree[leftIndex];
    }
    
    // Get the right child of a node at index
    public int getRightChild(int i) {
        int rightIndex = 2 * i + 2;
        if (rightIndex >= size) {
            throw new IllegalStateException("No Right Child");
        }
        return tree[rightIndex];
    }
    
    // Get the parent of a node at index
    public int getParent(int i) {
        if (i == 0) {
            throw new IllegalStateException("Root node has no parent");
        }
        int parentIndex = (i - 1) / 2;
        return tree[parentIndex];
    }
    
    // Display the binary tree as an array using Arrays.toString
    public void display() {
        System.out.println(Arrays.toString(Arrays.copyOf(tree, size)));
    }

    // Delete a node from the binary tree
    public void delete(int value) {
        int index = search(value);
        if (index == -1) {
            throw new IllegalStateException("Value not found in the tree");
        }
        // Replace the node to delete with the last node
        tree[index] = tree[size - 1];
        size--;
    }
    
    // Search for a specific node and return its index
    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (tree[i] == value) {
                return i;
            }
        }
        return -1;
    }
    
    // Get the value of a specific node
    public int getNodeValue(int value) {
        int index = search(value);
        if (index == -1) {
            throw new IllegalStateException("Node not found");
        }
        return tree[index];
    }
}
```
---

### **Explanation of Methods:**

- **insert(int capacity):** Initializes the tree with a fixed size (`capacity`).
- **insert(int value):** Adds a new value to the tree (in the next available position).
- **getRoot():** Returns the value of the root node (first element).
- **getLeftChild(int i):** Returns the left child of the node at index `i`.
- **getRightChild(int i):** Returns the right child of the node at index `i`.
- **getParent(int i):** Returns the parent of the node at index `i`.
- **display():** Displays the tree in the form of an array.
- **delete(int value):** Removes a node by replacing it with the last node and reducing the size.
- **search(int value):** Searches for a value in the tree and returns its index.
- **getNodeValue(int value):** Returns the value of a specific node, or throws an error if not found.
