import java.util.Arrays;

class Questionthree {

    public static void mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= high) {
            temp[k++] = nums[j++];
        }

        for (i = low; i <= high; i++) {
            nums[i] = temp[i - low];
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        
    }
}