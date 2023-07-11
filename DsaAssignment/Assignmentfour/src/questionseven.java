import java.util.ArrayList;
import java.util.Arrays;

public class questionseven {
    public static void main(String[] args) {
      
        int m=3,n=3;
        int[][] ops = {{2,2}{3,3}};
        for (var op: ops) {
            if (op[0] < m) m = op[0];
            if (op[1] < n) n = op[1];
        }
        System.out.println(m*n);
    
    }
}
