

class questiontwo{
Node head;


    class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    
    void removeDuplicates() {
        if (head == null)
            return;
        
        Node current = head;
        
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
    
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
      questiontwo list = new questiontwo();
        
        // Create the sorted linked list
        list.head = new Node(11);
        list.head.next = new Node(11);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(21);
        list.head.next.next.next.next = new Node(43);
        list.head.next.next.next.next.next = new Node(43);
        list.head.next.next.next.next.next.next = new Node(60);
        
        System.out.println("Input:");
        list.printList();
        
        list.removeDuplicates();
        
        System.out.println("Output:");
        list.printList();
    }
}