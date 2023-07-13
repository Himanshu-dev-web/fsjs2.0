class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

class Result {
    int maxSum;
    TreeNode subtreeRoot;
    
    Result(int maxSum, TreeNode subtreeRoot) {
        this.maxSum = maxSum;
        this.subtreeRoot = subtreeRoot;
    }
}

public class questionone {
    public static TreeNode findMaxSubtree(TreeNode root) {
        Result result = findMaxSubtreeHelper(root);
        return result.subtreeRoot;
    }
    
    private static Result findMaxSubtreeHelper(TreeNode node) {
        if (node == null) {
            return new Result(0, null);
        }
        
        Result leftResult = findMaxSubtreeHelper(node.left);
        Result rightResult = findMaxSubtreeHelper(node.right);
        
        int currentSum = leftResult.maxSum + rightResult.maxSum + node.val;
        
        if (leftResult.maxSum > currentSum && leftResult.maxSum > rightResult.maxSum) {
            return new Result(leftResult.maxSum, leftResult.subtreeRoot);
        } else if (rightResult.maxSum > currentSum) {
            return new Result(rightResult.maxSum, rightResult.subtreeRoot);
        } else {
            return new Result(currentSum, node);
        }
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        TreeNode maxSubtree = findMaxSubtree(root);
        
        int maxSum = calculateSum(maxSubtree);
        
        System.out.println("Maximum Subtree Sum: " + maxSum);
    }
    
    private static int calculateSum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftSum = calculateSum(node.left);
        int rightSum = calculateSum(node.right);
        
        return leftSum + rightSum + node.val;
    }
}
