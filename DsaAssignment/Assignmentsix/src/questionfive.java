import java.util.Arrays;

public class questionfive {
    public static void main(String[] args) {
    
        int[] arr1 = {5,3,4,2};
        int[] arr2 = {4,2,2,5};
        int d = minProductSum(arr1, arr2);
        System.out.println(d);

    }

    public static int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int sum = 0;
        int length = nums1.length;
        for (int i = 0; i < length; i++)
            sum += nums1[i] * nums2[length - 1 - i];
        return sum;
    }
}
