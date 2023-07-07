import java.util.HashMap;

public class questionone {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i =0; i < nums.length; i++){
            hash.put(nums[i],i);
        }
        
         for(int i =0; i < nums.length; i++){
         int num = nums[i];
        int rem = target - num;
             
             if(hash.containsKey(rem)){
                 int index = hash.get(rem);
                 if(index == i)
                     continue;
                     else{
                        System.out.println(i+ "" +index);
                        break;
                     }
             }
         }
    }
}
