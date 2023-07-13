import java.util.Arrays;

class Questionfour {

    public static void pushZerosToEnd(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 0, 3, 6};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}