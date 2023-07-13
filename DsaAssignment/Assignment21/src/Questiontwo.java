class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class Questiontwo {
    public static int findDistance(TreeNode root, int node1, int node2) {
        TreeNode lca = findLCA(root, node1, node2);
        
        int distance1 = findDistanceToNode(lca, node1, 0);
        int distance2 = findDistanceToNode(lca, node2, 0);
        
        return distance1 + distance2;
    }
    
    private static TreeNode findLCA(TreeNode root, int node1, int node2) {
        if (root == null) {
            return null;
        }
        
        if (root.val > node1 && root.val > node2) {
            return findLCA(root.left, node1, node2);
        } else if (root.val < node1 && root.val < node2) {
            return findLCA(root.right, node1, node2);
        } else {
            return root;
        }
    }
    
    private static int findDistanceToNode(TreeNode node, int target, int distance) {
        if (node == null) {
            return -1;
        }
        
        if (node.val == target) {
            return distance;
        } else if (node.val > target) {
            return findDistanceToNode(node.left, target, distance + 1);
        } else {
            return findDistanceToNode(node.right, target, distance + 1);
        }
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);
        
        int node1 = 3;
        int node2 = 4;
        
        int distance = findDistance(root, node1, node2);
        System.out.println("The distance between the two keys: " + distance);
    }
}
