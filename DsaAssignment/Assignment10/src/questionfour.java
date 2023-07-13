import java.util.ArrayList;


class Solution {
   public static void main(String[] args) {
       String  str = "abcd";
       int ans  = finLen(str);
       System.out.println(ans);

   }
   
  private static int finLen(String str)
    {
 
        if (str.equals(""))
            return 0;
        else
            return finLen(str.substring(1)) + 1;
    }
 
}