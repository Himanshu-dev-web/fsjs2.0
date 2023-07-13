import java.util.Arrays;

public class Questionthree {
    public static boolean isLevelOrderBST(int[] levelOrder) {
        if (levelOrder == null || levelOrder.length == 0) {
            return true;
        }
        
        int n = levelOrder.length;
        
        int rightStart = n;
        for (int i = 1; i < n; i++) {
            if (levelOrder[i] >= levelOrder[0]) {
                rightStart = i;
                break;
            }
        }
        
        for (int i = rightStart; i < n; i++) {
            if (levelOrder[i] < levelOrder[0]) {
                return false;
            }
        }
        
        boolean isLeftBST = isLevelOrderBST(Arrays.copyOfRange(levelOrder, 1, rightStart));
        boolean isRightBST = isLevelOrderBST(Arrays.copyOfRange(levelOrder, rightStart, n));
        
        return isLeftBST && isRightBST;
    }
    
    public static void main(String[] args) {
        int[] levelOrder1 = {7, 4, 12, 3, 6, 8, 1, 5, 10};
        boolean result1 = isLevelOrderBST(levelOrder1);
        System.out.println("Output1: " + (result1 ? "Yes" : "No"));
        
       
    }
}
