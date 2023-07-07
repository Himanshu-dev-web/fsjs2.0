import java.util.Arrays;

public class questioneight {
    public static void main(String[] args) {
        

        int[] nums = {3,2,2};

        int n  =nums.length;
        int i=0;
       while(i < n){
           int correct = nums[i] -1;
           if(nums[i] != nums[correct]){
               int temp = nums[i];
               nums[i] = nums[correct];
               nums[correct] = temp;
           }
           else
           {
               i++;
           }       
   }
   System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++){
           if(nums[j] != j+1){
               System.out.println(nums[j]+ "" + j+1);
           }
       }
    //    return new int[] {-1,-1};
    }
}
