import java.util.ArrayList;
import java.util.Arrays;

public class questionseven {
    public static void main(String[] args) {
      
        int[] nums = {3,4,5,1,2};
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
            System.out.println(nums[0]);
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
        System.out.println(nums[s]);
    
    }
}
