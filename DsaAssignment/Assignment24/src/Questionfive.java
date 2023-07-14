import java.util.*;

public class Questionfive {

    public static int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            uglyNumbers[i] = min(uglyNumbers[i2] * 2, uglyNumbers[i3] * 3, uglyNumbers[i5] * 5);
            if (uglyNumbers[i] == uglyNumbers[i2] * 2) {
                i2++;
            }
            if (uglyNumbers[i] == uglyNumbers[i3] * 3) {
                i3++;
            }
            if (uglyNumbers[i] == uglyNumbers[i5] * 5) {
                i5++;
            }
        }
        return uglyNumbers[n - 1];
    }

    private static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1)); // 12
    }
}