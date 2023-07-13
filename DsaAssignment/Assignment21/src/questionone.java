import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class questionone {
    public static void convertToBST(TreeNode root) {
        // Step 1: Perform in-order traversal and collect node values
        List<Integer> values = new ArrayList<>();
        inOrderTraversal(root, values);

        // Step 2: Sort the collected values in ascending order
        Collections.sort(values);

        // Step 3: Construct the BST using the sorted values
        int[] index = { 0 };
        constructBST(root, values, index);
    }

    private static void inOrderTraversal(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left, values);
        values.add(node.val);
        inOrderTraversal(node.right, values);
    }

    private static void constructBST(TreeNode node, List<Integer> values, int[] index) {
        if (node == null) {
            return;
        }

        constructBST(node.left, values, index);
        node.val = values.get(index[0]);
        index[0]++;
        constructBST(node.right, values, index);
    }

    public static void inOrderTraversalPrint(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversalPrint(root.left);
        System.out.print(root.val + " ");
        inOrderTraversalPrint(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(4);

        System.out.println("Binary Tree:");
        inOrderTraversalPrint(root);
        System.out.println();

        convertToBST(root);

        System.out.println("Converted BST:");
        inOrderTraversalPrint(root);
        System.out.println();
    }
}
