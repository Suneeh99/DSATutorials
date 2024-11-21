# Circular Queue and Stack Operations

#### Circular Queue

In a circular queue, elements are arranged in a circular manner, allowing the front and rear positions to wrap around. When both front and rear increase by 1, this indicates an enqueue operation, where a new element is inserted. 

In a circular queue:
- **Enqueue** increases the rear pointer (`R++`) and inserts the element.
- **Dequeue** increases the front pointer (`F++`) to remove the element.

---

### Stack Operations

A **stack** follows the Last-In-First-Out (LIFO) principle, where the last element added is the first one to be removed.

Basic stack operations:
1. **Clear**: Clears the stack by setting `top = -1`.
2. **Push**: Adds an element to the top (`top++`) of the stack.
3. **Pop**: Removes an element from the top (`top--`) of the stack.
4. **IsEmpty**: Checks if the stack is empty by verifying if `top == -1`.
5. **IsFull**: Checks if the stack is full by verifying if `top == size - 1`.
6. **Peek**: Retrieves the top element without removing it.

#### Stack Implementation (Using Array)

1. **Initialization**: 
   ```java
   public Stack(int size){
      arr = new int[size];
      capacity = size;
      top = -1;
   }
   ```

2. **Check if Empty**:
   ```java
   boolean isEmpty(){
      return top == -1;
   }
   ```

3. **Check if Full**:
   ```java
   boolean isFull(){
      return top == capacity - 1;
   }
   ```

4. **Push Operation**:
   ```java
   public void push(int x){
      if (isFull()){
         System.out.println("Stack is full");
         return;
      }
      arr[++top] = x;
   }
   ```

5. **Pop Operation**:
   ```java
   public int pop(){
      if (isEmpty()){
         System.out.println("Stack is empty");
         return -1;
      }
      return arr[top--];
   }
   ```

6. **Peek Operation**:
   ```java
   public int peek(){
      if (!isEmpty()){
         return arr[top];
      }
      return -1;
   }
   ```

---

### Double-Ended Queue (Deque)

A **deque** is a more flexible structure that allows insertion and deletion from both ends (front and rear). A deque can be used to implement a stack by performing push and pop operations from one end.

#### Step-by-Step Push and Pop using Two Queues

1. **Push Operation**:
   - Insert the element into the push queue.
   - Move all elements from the pop queue into the push queue, then swap the queues.

2. **Pop Operation**:
   - Remove the top element from the pop queue (which is the last pushed value).

#### Efficiency of Stack Operations
- **Time Complexity**:
   - Push, Pop, and Peek operations have constant time complexity, O(1).
- **Space Complexity**: 
   - O(n), where n is the number of elements in the stack.

---

### FIFO Queue

A **First-In-First-Out (FIFO) Queue** ensures that elements are processed in the order they arrive.

**Basic Operations**:
1. **Enqueue**: Adds an element to the rear end.
2. **Dequeue**: Removes an element from the front.

#### Enqueue and Dequeue Example
```java
public void enqueue(int x) {
   if (isFull()) {
      System.out.println("Queue is full");
      return;
   }
   arr[++rear] = x;
}

public int dequeue() {
   if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
   }
   return arr[front++];
}
```

In FIFO, the front element is always the next one to be processed.

### GitHub Submission
For your submission, you can implement stack data structures using:
1. **Array-based stack**
2. **Linked list-based stack**
3. **Deque-based stack**

These approaches will demonstrate different ways to handle stack operations efficiently.
