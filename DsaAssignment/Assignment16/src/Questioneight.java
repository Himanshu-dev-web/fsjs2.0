import java.util.Stack;

class GFG {
    static void leftSmaller(int arr[], int n, int SE[]) {
        Stack<Integer> S = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!S.empty() && S.peek() >= arr[i]) {
                S.pop();
            }

            if (!S.empty()) {
                SE[i] = S.peek();
            } else {
                SE[i] = 0;
            }

            S.push(arr[i]);
        }
    }

    static int findMaxDiff(int arr[], int n) {
        int[] LS = new int[n]; // To store left smaller elements
        int[] RRS = new int[n]; // To store right smaller elements

        leftSmaller(arr, n, LS);

        // Reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        leftSmaller(arr, n, RRS);

        int result = -1;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, Math.abs(LS[i] - RRS[n - 1 - i]));
        }

        return result;
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 8};
        int n = arr.length;
        System.out.println("Maximum diff: " + findMaxDiff(arr, n));
    }
}
