import java.util.ArrayList;


class Solution {
   public static void main(String[] args) {
        int N = 5;
        int P = 2;
        long result = findExponent(N, P);
        System.out.println("Result: " + result); 


   }
   
   public static long findExponent(int N, int P) {
        return (long) Math.pow(N, P);
    }
}