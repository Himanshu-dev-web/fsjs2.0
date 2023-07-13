import java.util.LinkedList;

public class Linkedlistthree {

    Node head;


    private int size;

            Linkedlistthree(){
                this.size=0;
            }


        class Node {
            int data;
            Node next;
            
            Node(int data) {
                this.data = data;
                this.next = null;
                size++;
            }

        }

        Node reverseKNodes(Node head, int k) {
            Node current = head;
            Node next = null;
            Node prev = null;
            int count = 0;
            
            // Reverse the first k nodes
            while (count < k && current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }
            
            // Recursively reverse the remaining nodes
            if (next != null) {
                head.next = reverseKNodes(next, k);
            }
            
            return prev;
        }
        
        void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

         public int getsize() {
                return size;
        }

    public void printList() {
                if(head == null) {
                         System.out.println("list is empty");
                return;
                }
                Node currNode = head;
                   while(currNode != null) {
                System.out.print(currNode.data + "-> ");
                   currNode = currNode.next;
                }
                System.out.println("NULL");
            }

    public void deltefirst(){
                if(head == null) {
                    return ;
                }

                head = head.next;
     }

    public void deletelast(){
            if(head == null) {
                    return ;
                }
                if(head.next == null) {
                    head = null;
                    return ;
                }
                
            Node secondlast = head;
            Node last  = head.next;
            while(last.next != null){
                last = last.next;
                secondlast = secondlast.next;
            }
            secondlast.next = null;
            }

    public static void main(String[] args) {
        
         Linkedlistthree list = new Linkedlistthree();
        
        // Create the linked list
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);
        
        System.out.println("Input:");
        list.printList(list.head);
        
        int k = 4; // Specify the value of k
        
        list.head = list.reverseKNodes(list.head, k);
        
        System.out.println("Output:");
        list.printList(list.head);
 



    }
}

