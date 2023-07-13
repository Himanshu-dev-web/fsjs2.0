import java.util.*;

public class questionone {

    public static int firstNonRepeatingCharacter(String s) {
        int n = s.length();
        int[] count = new int[256];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i)] == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        int index = firstNonRepeatingCharacter(s);
        System.out.println(index);
    }
}