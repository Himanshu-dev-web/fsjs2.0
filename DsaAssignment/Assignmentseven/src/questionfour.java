import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class questionfour {
    public static void main(String[] args) {
       
      String str = "abcdefg";
      int k =2;


       String ans  = reverseStr(str,k);

        System.out.println(ans);
        
        
    }


    public static String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;
        for(int i = 0 ; i <= n-1; i += 2*k){
            if(i+k-1 <= n-1){
                reverseK(i,i+k-1,str);
            }else{
                reverseK(i,n-1,str);
            }
        }
        String ans = new String(str);
        return ans;
    }
    public static void reverseK(int i, int j, char[] str){
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}
