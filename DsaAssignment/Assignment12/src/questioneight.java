class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class questioneight {
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

    boolean isCircular() {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }


    public class Main {
    public static void main(String[] args) {
        questioneight linkedList = new questioneight();

        // Add nodes to the linked list
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);

        // Create a cycle by connecting the last node to the second node
        linkedList.head.next.next.next.next = linkedList.head.next;

        boolean isCircular = linkedList.isCircular();
        System.out.println("Is Circular: " + isCircular);
    }
}

}

