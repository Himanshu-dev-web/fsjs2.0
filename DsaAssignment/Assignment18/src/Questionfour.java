import java.util.Arrays;

class Questionfour {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int max = Arrays.stream(nums).max().getAsInt();
        int[] sorted = radixSort(nums, max);

        int maxDiff = 0;
        for (int i = 1; i < sorted.length; i++) {
            maxDiff = Math.max(maxDiff, sorted[i] - sorted[i - 1]);
        }

        return maxDiff;
    }

    private int[] radixSort(int[] nums, int max) {
        int[] sorted = new int[nums.length];

        for (int exp = 1; max / exp > 0; exp *= 10) {
            int[] count = new int[10];

            for (int num : nums) {
                count[(num / exp) % 10]++;
            }

            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            for (int i = nums.length - 1; i >= 0; i--) {
                int index = (nums[i] / exp) % 10;
                sorted[count[index] - 1] = nums[i];
                count[index]--;
            }

            System.arraycopy(sorted, 0, nums, 0, nums.length);
        }

        return sorted;
    }


      public static void main(String[] args) {
        int[] nums = {3, 6, 9, 1};

        Questionfour solution = new Questionfour();
        int maxDiff = solution.maximumGap(nums);
        System.out.println("Maximum difference: " + maxDiff);
}
}

  

