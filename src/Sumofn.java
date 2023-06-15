public class Sumofn {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = computeSum(numbers);
        System.out.println("Sum of the numbers is: " + sum);
    }

    public static int computeSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
