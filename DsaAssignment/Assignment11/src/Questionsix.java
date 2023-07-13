import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Questionsix {
    public static void main(String[] args) {
       int[] num = {3,4,5,1,2};
       int ans = findMin(num);
        System.out.println(ans);
    }

    public static int findMin(int[] nums) {
        int n = nums.length;
        int flag = 0;
    
        for(int i=0; i<n-1; i++)
        {
            if(nums[i] > nums[i+1]) {
                flag = 1;
                break;
            }
        }

        if(flag == 0) {
            return nums[0];
        }
        
        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;

        while(s<e) 
        {
            if(nums[0] <= nums[mid]) {
                s = mid+1;
            }
            else if(nums[0] > nums[mid]) {
                e = mid;
            }
            mid = s+(e-s)/2;
        }
        return nums[s];
    }
}
