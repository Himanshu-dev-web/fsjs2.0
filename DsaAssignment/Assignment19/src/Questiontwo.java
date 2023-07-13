import java.util.Arrays;
import java.util.Stack;

class Questiontwo {

    public static int[] countSmaller(int[] nums) {
        int[] counts = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();
            }

            counts[i] = stack.size();
            stack.push(nums[i]);
        }

        return counts;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        int[] counts = countSmaller(nums);
        System.out.println(Arrays.toString(counts));
        
    }
}