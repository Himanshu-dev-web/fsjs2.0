import java.util.*;

import java.util.Queue;

class Questionseven {

    private static List<Integer> queue;
    private int front;
    private int middle;

    public Questionseven() {
        queue = new ArrayList<>();
        front = 0;
        middle = 0;
    }

    public void pushFront(int val) {
        queue.add(0, val);
        if (queue.size() % 2 == 0) {
            middle++;
        }
    }

    public void pushMiddle(int val) {
        queue.add(middle, val);
        middle++;
    }

    public void pushBack(int val) {
        queue.add(val);
    }

    public int popFront() {
        if (queue.isEmpty()) {
            return 1;
        }

        int val = queue.get(front);
        queue.remove(front);
        front++;
        if (front > middle) {
            middle = front / 2;
        }

        return val;
    }

    public int popMiddle() {
        if (queue.isEmpty()) {
            return 1;
        }

        int val = queue.get(middle - 1);
        queue.remove(middle - 1);
        middle--;
        if (middle < front) {
            front = middle / 2;
        }

        return val;
    }

    public int popBack() {
        if (queue.isEmpty()) {
            return 1;
        }

        int val = queue.get(queue.size() - 1);
        queue.remove(queue.size() - 1);
        return val;
    }

    public static void main(String[] args) {
        Questionseven q = new Questionseven();
        q.pushFront(1);   // [1]s
        q.pushBack(2);    // [1,2]
        q.pushMiddle(3);  // [1,3, 2]
        q.pushMiddle(4);  // [1,4, 3, 2]
        
        
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(q.popFront());     
        System.out.println(q.popMiddle());    
        System.out.println(q.popMiddle());  
        System.out.println(q.popBack());      
        System.out.println(q.popFront());     
    }
}