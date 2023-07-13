import java.util.Arrays;
import java.util.HashMap;

public class questionone{
    public static void main(String[] args) {

      int n=1;
      boolean ans  = isPowerOfTwo(n);

        System.out.println(ans);
    }

    public  static boolean isPowerOfTwo(int n) {
      if (n <= 0) {
          return false; 
      }
      
      if ((n & (n - 1)) == 0) {
          return true; 
      }
      
      return false;
  }
}
