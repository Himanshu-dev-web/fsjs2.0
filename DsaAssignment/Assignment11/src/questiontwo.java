import java.util.Arrays;
import java.util.HashMap;

public class questiontwo {
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        if(nums.length==1)
        {
            return 0;
        }
        else{
            for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                if(nums[i]>nums[i]+1)
                {
                    return i;
                }
            }
            else if(i==nums.length-1)
            {
                if(nums[i]>nums[i-1])
                {
                    return i;
                }
            }
            else if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
            {
                return i;
            }
            
        }

        }

        
        return 0;
    }
}