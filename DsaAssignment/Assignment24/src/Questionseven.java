import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Questionseven {


    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>(); // Stores indices of elements in the window
        
        int index = 0;
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
                        deque.offer(i);
                        if (i >= k - 1) {
                result[index++] = nums[deque.peek()];
            }
        }
        
        return result;
    }


    public static void main(String[] args) {
           int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
       int[] ans  = maxSlidingWindow(nums, k);
       System.out.println(Arrays.toString(ans));
    }
    
}
