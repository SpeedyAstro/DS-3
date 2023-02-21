## Arrays

**Defination** -
An array is a collection of elements of the same data type stored in contiguous memory locations.

**Properties** :
- Fixed size (in most languages)
- Constant time access to individual elements
- Random access to elements

**Operations**:
- *Insertion*: O(n) time complexity, may involve shifting elements to make space
- *Deletion*: O(n) time complexity, may involve shifting elements to fill the gap
- *Search*: O(n) time complexity for unsorted arrays, O(log n) time complexity for sorted arrays using binary search
- *Access*: O(1) time complexity, constant time to access any element

**Time complexity of common operations**:
- Indexing: O(1)
- Searching: O(n) or O(log n) for binary search
- Insertion/Deletion: O(n)
- Sorting: O(n log n) or O(n^2) depending on the sorting algorithm used

**Advantages**:
- Constant time access to individual elements
- Random access to elements
- Easy to implement and use

**Disadvantages :**
- Fixed size, difficult to resize
- Insertion and deletion are expensive operations

**Use cases :**
- Storing a collection of data that needs to be accessed randomly or in a specific order
- Implementing other data structures, such as stacks and queues


**Example of array implementation :**
```java
// creating an array in Java
int[] arr = {1, 2, 3, 4, 5};

// accessing elements in an array
System.out.println(arr[0]);  // Output: 1

// inserting an element in an array
int[] newArr = new int[arr.length + 1];
for (int i = 0; i < arr.length; i++) {
    newArr[i] = arr[i];
}
newArr[newArr.length - 1] = 6;
arr = newArr;
System.out.println(Arrays.toString(arr));  // Output: [1, 2, 3, 4, 5, 6]

// deleting an element from an array
int[] anotherArr = new int[arr.length - 1];
int indexToDelete = 2;
int j = 0;
for (int i = 0; i < arr.length; i++) {
    if (i != indexToDelete) {
        anotherArr[j++] = arr[i];
    }
}
arr = anotherArr;
System.out.println(Arrays.toString(arr));  // Output: [1, 2, 4, 5, 6]

```