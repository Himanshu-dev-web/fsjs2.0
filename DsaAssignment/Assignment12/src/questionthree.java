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
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    int getNthFromEnd(int n) {
        if (head == null) {
            return -1; // Assuming -1 is used to indicate an invalid result
        }

        Node slow = head;
        Node fast = head;

        // Move the fast pointer n nodes ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return -1; // Assuming -1 is used to indicate an invalid result
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.addNode(7);
        linkedList.addNode(8);
        linkedList.addNode(9);

        int n = 2;
        int nthNodeFromEnd = linkedList.getNthFromEnd(n);
        System.out.println("Nth node from the end: " + nthNodeFromEnd);
    }
}
}

