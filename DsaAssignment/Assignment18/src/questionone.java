import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class questionone {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> mergedIntervals = new ArrayList<>();

        // Iterate through sorted intervals
        for (int[] interval : intervals) {
             if (mergedIntervals.isEmpty() || interval[0] > mergedIntervals.get(mergedIntervals.size() - 1)[1]) {
                mergedIntervals.add(interval);
            }
             else {
                mergedIntervals.get(mergedIntervals.size() - 1)[1] = Math.max(
                        mergedIntervals.get(mergedIntervals.size() - 1)[1],
                        interval[1]
                );
            }
        }
        int[][] result = new int[mergedIntervals.size()][2];
        for (int i = 0; i < mergedIntervals.size(); i++) {
            result[i] = mergedIntervals.get(i);
        }

        return result;
    }



    
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        questionone solution = new questionone();
        int[][] merged = solution.merge(intervals);

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    
}

}

