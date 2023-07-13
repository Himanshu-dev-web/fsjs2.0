import java.util.Stack;

class Questioneight {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int max2 = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < max2) {
                return true;
            }

            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                max2 = stack.pop();
            }

            stack.push(nums[i]);
        }

        return false;
    }
     public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        Questioneight solution = new Questioneight();
        boolean contains132Pattern = solution.find132pattern(nums);

        System.out.println("Contain 132 pattern: " + contains132Pattern);
    }

}

   
