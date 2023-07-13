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

    void insertAlternate(LinkedList secondList) {
        if (head == null || secondList.head == null) {
            return;
        }

        Node firstCurrent = head;
        Node secondCurrent = secondList.head;
        Node firstNext, secondNext;

        while (firstCurrent != null && secondCurrent != null) {
            // Store the next pointers of both lists
            firstNext = firstCurrent.next;
            secondNext = secondCurrent.next;

            // Make the second list's node the new next of the first list's node
            firstCurrent.next = secondCurrent;
            secondCurrent.next = firstNext;

            // Move the pointers to the next nodes
            firstCurrent = firstNext;
            secondCurrent = secondNext;
        }

        // Set the head of the second list to null to empty it
        secondList.head = null;
    }

    void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
    public class Main {
    public static void main(String[] args) {
        LinkedList firstList = new LinkedList();
        LinkedList secondList = new LinkedList();

        // Add nodes to the first list
        firstList.addNode(5);
        firstList.addNode(7);
        firstList.addNode(17);
        firstList.addNode(13);
        firstList.addNode(11);

        // Add nodes to the second list
        secondList.addNode(12);
        secondList.addNode(10);
        secondList.addNode(2);
        secondList.addNode(4);
        secondList.addNode(6);

        firstList.insertAlternate(secondList);

        System.out.print("First List: ");
        firstList.printList();
        System.out.println();

        System.out.print("Second List: ");
        secondList.printList();
        System.out.println();
    }
}

}

