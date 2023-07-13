class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addNode(char data) {
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

    boolean isPalindrome() {
        StringBuilder sb = new StringBuilder();
        Node currentNode = head;

        // Traverse the linked list and store each character in a string
        while (currentNode != null) {
            sb.append(currentNode.data);
            currentNode = currentNode.next;
        }

        String originalString = sb.toString();
        String reverseString = sb.reverse().toString();

        // Compare the original string with its reverse
        return originalString.equals(reverseString);
    }

    
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Add nodes to the linked list
        linkedList.addNode('R');
        linkedList.addNode('A');
        linkedList.addNode('D');
        linkedList.addNode('A');
        linkedList.addNode('R');

        boolean isPalindrome = linkedList.isPalindrome();
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}

}
