
public class questiontwo {

    public static void main(String[] args) {
        
        int[] nums = {3,2,2,3};
        int val = 2;
        if(nums.length == 0) System.out.println(0);
        int size = 0;
        for (int i = 0; i <nums.length; i++) {
            if(nums[i] != val){
                nums[size] = nums[i];
                size++;
            }
        }

        System.out.println(size);
    }
    
}
