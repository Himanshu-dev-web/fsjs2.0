import java.util.Arrays;

public class questionseven {
    public static void main(String[] args) {
        
        
        int[] nums = {0,1,0,3,12};
        int tempindex = 0;


        for(int i=0; i<nums.length;i++){
            if(nums[i] != 0){
                nums[tempindex++] = nums[i];
            }
        }


        for(int i = tempindex ; i < nums.length ; i++){
            nums[i] = 0; 
        }


        System.out.println(Arrays.toString(nums));
    }
}
