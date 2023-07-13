import java.util.ArrayList;
import java.util.Arrays;


class Solution {
   public static void main(String[] args) {
      int[] nums = {1,3,4,2,2};

      System.out.println(findDuplicate(nums));

   }
   
 public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if (nums[i]==nums[i-1]) return nums[i];
        }
        return nums[nums.length-1];
    }
 
}