


import java.util.Stack;

class Questionseven {

  private Stack<Integer> stack;
  private Stack<Integer> minStack;

  public Questionseven() {
    stack = new Stack<>();
    minStack = new Stack<>();
  }

  public void push(int val) {
    stack.push(val);
    if (minStack.isEmpty() || val <= minStack.peek()) {
      minStack.push(val);
    }
  }

  public void pop() {
    int val = stack.pop();
    if (val == minStack.peek()) {
      minStack.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }


  public class Main {

  public static void main(String[] args) {
    Questionseven minStack = new Questionseven();
    minStack.push(1);
    minStack.push(2);
    minStack.push(3);
    minStack.push(0);
    System.out.println(minStack.getMin()); // 0
    minStack.pop();
    System.out.println(minStack.getMin()); // 1
  }
}
}

