import java.util.Arrays;

public class Questiontwo {

		public static int maxSumCircularSubarray(int[] nums) {
			int s1 = nums[0], s2 = nums[0], f1 = nums[0], f2 = nums[0], total = nums[0];
			for (int i = 1; i < nums.length; ++i) {
				total += nums[i];
				f1 = nums[i] + Math.max(f1, 0);
				f2 = nums[i] + Math.min(f2, 0);
				s1 = Math.max(s1, f1);
				s2 = Math.min(s2, f2);
			}
			return s1 > 0 ? Math.max(s1, total - s2) : s1;
		}


    public static void main(String[] args) {
        int[] nums = {1,-2,3,-2};
        int maxSum = maxSumCircularSubarray(nums);
        System.out.println(maxSum);
    }
}