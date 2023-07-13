public class questionone {

    Node head;


    static int size;

            questionone(){
                this.size=0;
            }


        class Node {
            String data;
            Node next;            
            Node (String data) {
            this.data = data;
            this.next = null;
            size++;
             }

            }


            public void addFirst(String data) {
                Node newNode = new Node (data);
                  if(head == null) { 
                          head = newNode;
                          return;
                }
                      newNode.next = head;
                head = newNode;
             }


             static Node deleteMid(Node head)
                {
                    // Base cases
                    if (head == null)
                        return null;
                    if (head.next == null) {
                        return null;
                    }
                    Node copyHead = head;
            
                    // Find the count of nodes
                    int count = size;
            
                    // Find the middle node
                    int mid = count / 2;
            
                    // Delete the middle node
                    while (mid-- > 1) {
                        head = head.next;
                    }
            
                    // Delete the middle node
                    head.next = head.next.next;
            
                    return copyHead;
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

    public static void main(String[] args) {
        
         questionone d = new questionone();
        
         d.addFirst("a");
         d.addFirst("b");
         d.addFirst("c");         
         d.addFirst("d");
        d.addFirst("e");
        d.printList();
    }
}
