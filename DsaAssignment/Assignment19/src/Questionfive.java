public class Questionfive {
    public static void alternateArrange(int[] arr) {
        int n = arr.length;
        
        int positiveIdx = 0;
        while (positiveIdx < n && arr[positiveIdx] < 0) {
            positiveIdx++;
        }
        
        int negativeIdx = 1;
        while (positiveIdx < n && negativeIdx < n) {
            int temp = arr[positiveIdx];
            arr[positiveIdx] = arr[negativeIdx];
            arr[negativeIdx] = temp;
            
            positiveIdx += 2;
            negativeIdx += 2;
        }
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, -4, -1, 4};
        alternateArrange(arr1);
        System.out.println("Output: ");
        printArray(arr1);
        
        int[] arr2 = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        alternateArrange(arr2);
        System.out.println("Output: ");
        printArray(arr2);
    }
    
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
