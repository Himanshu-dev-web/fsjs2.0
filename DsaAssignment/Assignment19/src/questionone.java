import java.util.Arrays;
import java.util.List;

class questionone {

    int val;
    questionone next;

    public questionone(int val) {
        this.val = val;
    }

    public questionone(int val, questionone next) {
        this.val = val;
        this.next = next;
    }

    public static questionone merge(List<questionone> lists) {
        questionone dummy = new questionone(0);
        questionone tail = dummy;
        
        for (questionone listNode : lists) {
            while (listNode != null) {
                tail.next = listNode;
                tail = tail.next;
                listNode = listNode.next;
            }
        }

        questionone head = dummy.next;
        dummy.next = null;

        return head;
    }

    public static void main(String[] args) {
        List<questionone> lists = Arrays.asList(new questionone(1, 4, 5), new questionone(1, 3, 4), new questionone(2, 6));
        questionone mergedList = merge(lists);
        System.out.println(mergedList);
        
    }
}
