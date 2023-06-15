public class StackExample {

    // this method pushes two values onto the stack and then adds them together
    public static int add(int x, int y) {
        int sum = x + y; // sum is a local variable that is stored on the stack
        return sum;
    }

    public static void main(String[] args) {
        int a = 1; // a and b are local variables stored on the stack
        int b = 2;
        int c = add(a, b); // the values of a and b are pushed onto the stack when add() is called
        // the result of the addition is stored in a local variable c on the stack
        System.out.println(c); // the value of c is popped off the stack and printed
    }
}

