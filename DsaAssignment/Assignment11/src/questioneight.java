import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class questioneight {
    public static void main(String[] args) {
        int arr[] = { 1,2,2,1 };
                int arr2[] = {2,2};

        int[] ans = intersect(arr, arr2);

      
        System.out.println( ans);
    
      
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();

        for (int num : nums1) {
            list.add(num);
        }

        for (int num : nums2) {
            if (list.contains(num)) {
                intersection.add(num);
                int x = list.indexOf(num);
                list.remove(x);
                
            }
        }

        int[] ans = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            ans[i] = intersection.get(i);
        }

        return ans;
    }
}