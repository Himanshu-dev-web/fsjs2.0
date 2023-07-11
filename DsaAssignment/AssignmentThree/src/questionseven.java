import java.util.ArrayList;
import java.util.Arrays;

public class questionseven {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};

           ArrayList<String> al=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;
            
            if(start!=nums[i]){
                al.add(""+start+"->"+nums[i]);
            }
            else{
                al.add(""+start);
            }
        }
        System.out.println(al);
    
    }
}
