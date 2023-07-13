import java.util.*;

public class Questionfour{

    // Node class
    static class Node{
        int val;
        Node left, right;

       
        Node next;

        // Constructor
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
            this.next = null;
        }
    }

    static void connectAtSameLevel(Node root){
        // Declare the queue.
        Queue<Node> q = new LinkedList<>();
        // Insert root in it.
        q.add(root);

        
        while (!q.isEmpty()){
            
            Node prev = null, cur = null;

            // Finding the size of the queue.
            int size = q.size();

            // Iterating from i = 0 to i = size.
            for (int i = 0; i <  size; i++){
                
                cur = q.peek();

                // Remove the front node of the queue.
                q.poll();

                 if (i > 0)
                    prev.next = cur;
             if (cur.left != null)
                    q.add(cur.left);

                if (cur.right != null)
                    q.add(cur.right);

                // Now assign cur to prev.
                prev = cur;
            }

            // Assign null to next pointer
            // of the last node of the current level.
            prev.next = null;
        }

    }
    // Function to print the tree using the next
    // pointer.
    static void printLevelWise(Node root){
        Node cur = root;
        while(cur!=null){
            System.out.print(cur.val + " ---> ");
            cur = cur.next;
        }
        System.out.println("null");

        cur = root.left;
        while(cur!=null){
            System.out.print(cur.val + " ---> ");
            cur = cur.next;
        }
        System.out.println("null");

        cur = root.left.left;
        while(cur!=null){
            System.out.print(cur.val + " ---> ");
            cur = cur.next;
        }
        System.out.println("null");
    }
    // Main function
    public static void main(String[] args) {
      
        Node root = new Node(1);
        root.left =  new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        
        connectAtSameLevel(root);

        printLevelWise(root);
    }

}
