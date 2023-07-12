import java.util.Arrays;
import java.util.HashMap;

public class questiontwo {
    public static void main(String[] args) {
        
        String str = "69";
        System.out.println(isStrobogrammatic(str)); // Output: true

    }

    public static boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> strobogrammaticMap = new HashMap<>();
        strobogrammaticMap.put('0', '0');
        strobogrammaticMap.put('1', '1');
        strobogrammaticMap.put('6', '9');
        strobogrammaticMap.put('8', '8');
        strobogrammaticMap.put('9', '6');

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char leftDigit = num.charAt(left);
            char rightDigit = num.charAt(right);

            if (!(strobogrammaticMap.containsKey(leftDigit) && strobogrammaticMap.get(leftDigit) == rightDigit)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
