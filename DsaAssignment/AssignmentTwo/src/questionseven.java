

class Solution {
        public boolean isMonotonic(int[] nums) {
        int c=0;int k=0;
                    for(int i=0;i<nums.length-1;i++)
                        {
                        if(nums[i+1]>=nums[i])
                        c++;
                        if(nums[i]>=nums[i+1])
                        k++;
                        }
                        if(c==nums.length-1||k==nums.length-1)
                return true;
                else
                return false;
            
            }
            }
