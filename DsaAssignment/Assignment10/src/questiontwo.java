import java.util.Arrays;
import java.util.HashMap;

public class questiontwo {
    public static void main(String[] args) {
        
        int n = 5;
        System.out.println(findSum(n));
    }

    static int findSum(int n)
    {
        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum = sum + x;
        return sum;
    }
 
}
