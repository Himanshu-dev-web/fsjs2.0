import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        
            int[] nums = {-1,2,1,-4};
        int target = 1;
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2]; 
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum; 
                }

                if (sum < target) {
                    j++; 
                } else {
                    k--; 
                }
            }
        }

        System.out.println(closestSum);
    }
}
