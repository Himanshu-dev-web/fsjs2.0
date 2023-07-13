import java.util.Arrays;

class Questionseven {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int len : dp) {
            maxLength = Math.max(maxLength, len);
        }

        return maxLength;
    }
      public static void main(String[] args) {
        int[] nums = {0,1,0,3,2,3};

        Questionseven solution = new Questionseven();
        int longestIncreasingLength = solution.lengthOfLIS(nums);

        System.out.println("Length of the longest strictly increasing subsequence: " + longestIncreasingLength);
    }
}

