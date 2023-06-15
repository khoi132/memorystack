public class convertToBinary {
    public static void main(String[] args) {
        int decimalNumber = 10;
        String binaryNumber = convertToBinary(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + " is: " + binaryNumber);
    }

    public static String convertToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }

        return binary.toString();
    }
}
