import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class questionseven {
    public static void main(String[] args) {
      
        int a = 2;
        int d = 1;
        int n = 5;
     System.out.println("The n term of AP "+ "" +
     "" + n + "" +nth_ap(a,d,n));
    }

     static int nth_ap(int a, int d, int n) {
       
        return (a + (n - 1) * d);
     }
}
