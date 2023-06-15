public class ArrayStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed element: " + value);
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        int poppedElement = stackArray[top--];
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
