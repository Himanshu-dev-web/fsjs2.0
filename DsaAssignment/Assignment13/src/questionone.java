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

    static LinkedList createNewList(LinkedList list1, LinkedList list2) {
        LinkedList newList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null && current2 != null) {
            if (current1.data > current2.data) {
                newList.addNode(current1.data);
            } else {
                newList.addNode(current2.data);
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return newList;
    }

    void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

        
    public class Main {
        public static void main(String[] args) {
            LinkedList list1 = new LinkedList();
            LinkedList list2 = new LinkedList();

            // Add nodes to list1
            list1.addNode(5);
            list1.addNode(2);
            list1.addNode(3);
            list1.addNode(8);

            // Add nodes to list2
            list2.addNode(1);
            list2.addNode(7);
            list2.addNode(4);
            list2.addNode(5);

            LinkedList newList = LinkedList.createNewList(list1, list2);

            System.out.print("New List: ");
            newList.printList();
        }
    }
}

