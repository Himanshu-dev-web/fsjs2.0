import java.util.Arrays;

public class questionthree {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        for(int i=0;i<n;i++){
            totalSum -= nums[i];
        }
        return totalSum;
    }
}

