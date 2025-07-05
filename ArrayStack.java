public class ArrayStack {

    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public ArrayStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // stack is initially empty
    }

    // Push element to stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // or throw exception
        }
        return stack[top--];
    }

    // Peek top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return stack[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Print stack elements
    public void printStack() {
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.printStack();
    }
}
