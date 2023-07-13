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

    void detectAndRemoveLoop() {
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (slow != fast) {
            return;
        }

        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;
    }
    public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Add nodes to the linked list
        linkedList.addNode(1);
        linkedList.addNode(3);
        linkedList.addNode(4);

        linkedList.head.next.next.next = linkedList.head.next;

        // Detect and remove the loop
        linkedList.detectAndRemoveLoop();

        // Print the updated linked list
        Node currentNode = linkedList.head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}

}

