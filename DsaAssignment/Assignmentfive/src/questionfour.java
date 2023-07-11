import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class questionfour {
    public static void main(String[] args) {
       
      int[] nums1= {1,2,3};
      int[] nums2 = {2,4,6};
        ArrayList<List<Integer>>l=new ArrayList<List<Integer>>();

        l = findDifference(nums1,nums2);
        
        
    }


    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<List<Integer>>l=new ArrayList<List<Integer>>();
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        
        HashSet<Integer>set=new HashSet<>();
        
        for(int i:nums2){
            set.add(i);
        }
        
        for(int i=0;i<nums1.length;i++){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
                l1.add(nums1[i]);
            }
        }
        l.add(l1);
        set.clear();
        
        for(int i:nums1){
            set.add(i);
        }
        
        for(int i=0;i<nums2.length;i++){
            if(!set.contains(nums2[i])){
                set.add(nums2[i]);
                l2.add(nums2[i]);
            }
        }
        l.add(l2);
        return l;
    }
}
