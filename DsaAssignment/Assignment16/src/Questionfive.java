import java.util.Stack;

public class Questionfive {

    public static int reverseNumber(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int digit = number % 10;
            stack.push(digit);
            number /= 10;
        }

        int reversedNumber = 0;
        while (!stack.isEmpty()) {
            int digit = stack.pop();
            reversedNumber *= 10;
            reversedNumber += digit;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseNumber(number);
        System.out.println("The reversed number is " + reversedNumber);
    }
}