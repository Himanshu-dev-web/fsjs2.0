import java.util.HashSet;

public class Questionsix {
    public static void main(String[] args) {
        int[] nums= {2,2,1};

        int ans=0; 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i]; 
        }
        System.out.println(ans);  
    }

}
