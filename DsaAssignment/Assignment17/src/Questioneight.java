import java.util.*;




class DataStream {

    private int value;
    private int k;
    private Deque<Integer> deque;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        this.deque = new LinkedList<>();
    }

    public boolean consec(int num) {
        deque.add(num);
        if (deque.size() < k) {
            return false;
        }

        int count = 0;
        for (int i = deque.size() - 1; i >= 0; i--) {
            if (deque.get(i) != value) {
                break;
            }

            count++;
        }

        return count == k;
    }

    public static void main(String[] args) {
        DataStream ds = new DataStream(4, 3);
        System.out.println(ds.consec(4)); // false
        System.out.println(ds.consec(4)); // false
        System.out.println(ds.consec(4)); // true
        System.out.println(ds.consec(3)); // false
    }
}