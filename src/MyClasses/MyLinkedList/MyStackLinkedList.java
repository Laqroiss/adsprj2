package MyClasses.MyLinkedList;

import MyInterfaces.MyStackInterface;

// Implements a generic stack using a linked list
public class MyStackLinkedList<T> implements MyStackInterface<T> {
    private MyLinkedList<T> linkedList; // Internal storage for the stack, using a linked list
    int top; //  top element in the stack

    // Constructor initializes the stack with an empty linked list and resets the top index
    /**
     * Initializes the stack with an empty linked list and resets the top index.
     * Time Complexity: O(1), as it simply initializes a new MyLinkedList instance and resets the top index.
     */
    public MyStackLinkedList(){
        linkedList = new MyLinkedList<T>();
        top = 0;
    }

    // Adds an item to the top of the stack
    /**
     * Adds an item to the top of the stack.
     * Time Complexity: O(1), as it simply delegates to the addLast method of MyLinkedList.
     */
    @Override
    public void push(T item) {
        linkedList.addLast(item); // Add item to the end of the linked list (which is the top of the stack)
        top++; // Increment top index to reflect new item addition
    }

    // Removes the item from the top of the stack
    /**
     * Removes the item from the top of the stack.
     * Time Complexity: O(1), as it simply delegates to the removeLast method of MyLinkedList.
     */
    @Override
    public void pop() {
        if (top > 0) {
            linkedList.removeLast(); // Remove the last item from the linked list
            top--; // Decrement top index
        }
    }

    // Returns the item at the top of the stack without removing it
    /**
     * Returns the item at the top of the stack without removing it.
     * Time Complexity: O(1), as it simply retrieves the last item in the linked list (top of the stack).
     */
    @Override
    public T get() {
        return linkedList.get(top - 1); // Retrieves the last item in the linked list (top of the stack)
    }

    // Clears all items from the stack
    /**
     * Clears all items from the stack.
     * Time Complexity: O(1), as it simply reinitializes the linked list and resets the top index.
     */
    @Override
    public void clear() {
        linkedList = new MyLinkedList<T>(); // Reinitialize the linked list
        top = 0; // Reset the top index
    }
}
