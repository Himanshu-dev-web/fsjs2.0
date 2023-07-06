public class questionthree {
    public static void main(String[] args) {
        
        int[] nums = {1,3,5,6} ; 
        int target = 5;

        int start = 0;
        int end = nums.length -1;
        
            
        while(start <= end){
            
            int mid  = start + (end - start)/2;
            if(target == nums[mid]){
                System.out.println(mid);
                break;
            }
            if(target > nums[mid]){
                start = mid+1;
            }
            else if(target < nums[mid]){
                end  = mid-1;
            }
            else{
                    System.out.println(mid);
                    break;
            }
        }

            System.out.println(start);

    }
}
