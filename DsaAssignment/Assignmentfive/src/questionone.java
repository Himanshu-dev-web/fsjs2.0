import java.util.Arrays;

public class questionone{
    public static void main(String[] args) {

        int[] original = {1,2,3,4};
        int m=2,n=2;
        if(original.length!= m*n) return new int [][]{};

        int[][]ans =new int[m][n];
        for(int i=0;i<original.length;i++)
            {
                ans[i/n][i%n]=original[i];
            }

            System.out.println(ans);    
        
    }
}
