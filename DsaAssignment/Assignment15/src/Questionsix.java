import java.util.Stack;

public class Questionsix {

  public static int evaluatePostfixExpression(String str) {
    Stack<Integer> stack = new Stack<>();
    for (char ch : str.toCharArray()) {
      if (ch >= '0' && ch <= '9') {
        stack.push(ch - '0');
      } else {
        int operand1 = stack.pop();
        int operand2 = stack.pop();
        int result = 0;
        switch (ch) {
          case '*':
            result = operand1 * operand2;
            break;
          case '/':
            result = operand1 / operand2;
            break;
          case '+':
            result = operand1 + operand2;
            break;
          case '-':
            result = operand1 - operand2;
            break;
        }
        stack.push(result);
      }
    }
    return stack.pop();
  }

  public static void main(String[] args) {
    String str = "23*4+5-";
    int result = evaluatePostfixExpression(str);
    System.out.println("The result of the postfix expression is: " + result);
  }
}