import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Questionsix {
    public static void main(String[] args) {
       
         HashSet<Integer> states = new HashSet<Integer>();
        List<Integer> result = new ArrayList<>();
        int[] nums = {4,3,2,7,8,2,3,1};

        for (int num : nums) {
            if (states.contains(num)) {
                result.add(num);
            } else {
                states.add(num);
            }
        }

        System.out.println(result);
    }

}
