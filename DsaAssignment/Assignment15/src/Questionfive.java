import java.util.Stack;

public class Questionfive {

  public static String reverseString(String str) {
    Stack<Character> stack = new Stack<>();
    for (char ch : str.toCharArray()) {
      stack.push(ch);
    }

    String reversedString = "";
    while (!stack.isEmpty()) {
      reversedString += stack.pop();
    }

    return reversedString;
  }

  public static void main(String[] args) {
    String str = "hello";
    String reversedString = reverseString(str);
    System.out.println("The reversed string is: " + reversedString);
  }
}