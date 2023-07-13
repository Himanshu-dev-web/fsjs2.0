import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class questionseven {
    public static void main(String[] args) {
     int[] nums = {5,7,7,8,8,10};
     int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(ans);


    }

    public static int[] searchRange(int[] nums, int target) {
        int res = Arrays.binarySearch(nums, target);

        if (res < 0 || nums.length == 0) return new int[]{-1, -1};
        if (nums.length == 1) {
            if (res == 0) return new int[]{0, 0};
            else return new int[]{-1, -1};
        }
        //above I've handled edge cases

        int a = res, b = res;

        //going to left and searching for the start index
        int left = res - 1;
        while (left >= 0 && nums[left] == target) {
            if (nums[left] == target) {
                a = left;
                left--;
            } else break;
        }

        //going to right and searching for the end index
        int right = res + 1;
        while (right < nums.length && nums[right] == target) {
            if (nums[right] == target) {
                b = right;
                right++;
            } else break;
        }

        return new int[]{a, b};
    }
}
