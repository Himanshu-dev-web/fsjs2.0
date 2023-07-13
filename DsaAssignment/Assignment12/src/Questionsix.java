class Node {
    int data;
    Node next;

       Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addNode(int data) {
        Node newNode = new Node(data);
          if (head == null) {
            head = newNode;
        }      else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    void retainMDeleteN(int M, int N) {
        if (head == null) {
            return;
        }

        Node currentNode = head;
           Node prevNode = null;
    
        while (currentNode != null) {
            int retainCount = 0;
            int deleteCount = 0;

            // Retain M nodes
            while (currentNode != null && retainCount < M) {
                prevNode = currentNode;
                    currentNode = currentNode.next;
                retainCount++;
            }

            // Delete N nodes
            while (currentNode != null && deleteCount < N) {
                currentNode = currentNode.next;
                deleteCount++;
            }
            prevNode.next = currentNode;
        }
    }
    public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Add nodes to the linked list
        linkedList.addNode(1);
        linkedList.addNode(2);
          linkedList.addNode(3);
          linkedList.addNode(4);
           linkedList.addNode(5);
        linkedList.addNode(6);
          linkedList.addNode(7);
        linkedList.addNode(8);

        int M = 2;
        int N = 2;

        linkedList.retainMDeleteN(M, N);

        Node currentNode = linkedList.head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}

}

