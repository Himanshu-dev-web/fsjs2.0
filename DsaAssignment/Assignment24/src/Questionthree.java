import java.util.*;

public  class Questionthree {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        return candidate;

    }

         public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums)); // 3
    }

    }

   