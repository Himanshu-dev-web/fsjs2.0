class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class DoublyLinkedListNode {
    int val;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;

    DoublyLinkedListNode(int val) {
        this.val = val;
    }
}

public class Questionthree {
    public static DoublyLinkedListNode convertToDoublyLinkedList(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Convert the binary tree to doubly linked list using in-order traversal
        DoublyLinkedListNode dummy = new DoublyLinkedListNode(-1);
        DoublyLinkedListNode tail = dummy;

        convertToDoublyLinkedListHelper(root, tail);

        DoublyLinkedListNode head = dummy.next;
        if (head != null) {
            head.prev = null;
        }

        return head;
    }

    private static void convertToDoublyLinkedListHelper(TreeNode node, DoublyLinkedListNode tail) {
        if (node == null) {
            return;
        }

        // Recursively convert the left subtree
        convertToDoublyLinkedListHelper(node.left, tail);

        // Create a new doubly linked list node for the current tree node
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(node.val);

        // Append the new node to the tail of the doubly linked list
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        // Recursively convert the right subtree
        convertToDoublyLinkedListHelper(node.right, tail);
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode head) {
        DoublyLinkedListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(30);
        root.right.right = new TreeNode(35);

        DoublyLinkedListNode doublyLinkedList = convertToDoublyLinkedList(root);

        System.out.println("Doubly Linked List:");
        printDoublyLinkedList(doublyLinkedList);
    }
}
