
import java.util.*;

class Questioneight{

  public static int Questioneight(int[] height) {
    int n = height.length;
    int[] leftMax = new int[n];
    int[] rightMax = new int[n];

    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    rightMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    int waterTrapped = 0;
    for (int i = 0; i < n; i++) {
      int minHeight = Math.min(leftMax[i], rightMax[i]);
      if (minHeight > height[i]) {
        waterTrapped += minHeight - height[i];
      }
    }

    return waterTrapped;
  }

  public static void main(String[] args) {
    int[] height = {4, 2, 0, 3, 2, 5};
    int waterTrapped = Questioneight(height);
    System.out.println("The amount of water trapped is: " + waterTrapped);
  }

}