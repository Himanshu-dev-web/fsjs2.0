import java.util.Arrays;

public class questionone{
    public static void main(String[] args) {

      int[] arr;
      String str ="IDID";
      arr= diStringMatch(str);

        System.out.println(Arrays.toString(arr));
    }
    public static int[] diStringMatch(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];

        int start = 0;
        int end = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = start++;
            } else {
                perm[i] = end--;
            }
        }
        perm[n] = start;

        return perm;
    }
}
