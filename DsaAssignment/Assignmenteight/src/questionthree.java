import java.util.Arrays;

public class questionthree {
    public static void main(String[] args) {
      String  word1 = "sea", word2 = "eat";

        System.out.println(minDistance(word1,word2));
   
    }

    public static int minDistance(String word1, String word2) 
    {
        int m = word1.length();
        int n=word2.length();
        
        int[][] dp = new int[m+1][n+1];
        
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j] =0;
                    continue;
                }
                
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j] = 1+ dp[i-1][j-1];
                
                else
                    dp[i][j]= Math.max(dp[i][j-1] , dp[i-1][j]);
            }
        }
        return m + n - 2 * dp[m][n];
    }
}

