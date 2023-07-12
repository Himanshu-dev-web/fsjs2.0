import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class questionfour {
    public static void main(String[] args) {
       
      int[] nums1= {0,1};

        int n = findMaxLen(nums1);
        System.out.println(n);
        
        
    }


     public static int findMaxLen(int[] nums) {
        HashMap<Integer,Integer>  hmap = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : nums[i]);
            if(sum == 0)
                maxLength = i+1;
            else if(hmap.containsKey(sum)) {
                maxLength = Math.max(maxLength,i - hmap.get(sum));
            }
            else 
                hmap.put(sum,i);
        }
        return maxLength;
    }
}
