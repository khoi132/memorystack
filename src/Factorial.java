public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int factorial = computeFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int computeFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * computeFactorial(number - 1);
        }
    }
}

