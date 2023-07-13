import java.util.Arrays;
import java.util.HashMap;

public class questionone{
    public static void main(String[] args) {
     int   num1 = 9;
    int ans =  lastRemaining(num1);
    System.out.println(ans);
    }

    public static int lastRemaining(int n) {
      boolean left = true;
      int head = 1;
      int step = 1;
      int remain = n;
      while(remain > 1){
          if(left || remain % 2 == 1){
              head = head + step;
          }
          step = step * 2;
          remain = remain / 2;
          left = !left;
      }
      return head;
  }
}
