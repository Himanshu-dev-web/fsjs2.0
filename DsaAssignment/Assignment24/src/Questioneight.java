import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questioneight {
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;
        
        while (right - left >= k) {
            if (Math.abs(x - arr[left]) <= Math.abs(x - arr[right])) {
                right--;
            } else {
                left++;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            result.add(arr[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        
        Questioneight solution = new Questioneight();
        List<Integer> result = solution.findClosestElements(arr, k, x);
        
        System.out.println(result);
    }
}
