import java.util.Arrays;

public class questioneight {
    public static void main(String[] args) {
        
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int result[]=new int[2*n];
        int ptr=n;
        int i=0,j=0;
        while(j<2*n-1){
           result[j]=nums[i];
           result[j+1]=nums[ptr+i];
           j+=2;
           i+=1;
        }
        System.out.println(result);
    }
}
