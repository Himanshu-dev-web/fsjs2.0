import java.util.Arrays;
import java.util.HashSet;

public class Questionsix {
    public static void main(String[] args) {
       
        int[] nums = {-4,-1,0,3,10};

        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int i = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }

            i--;
        }


        System.out.println(Arrays.toString(result));
    
    }

}
