import java.util.*;

public class Questionfour {

    private Queue<Integer> queue;

    public Questionfour() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }

    public static void main(String[] args) {
        Questionfour recentCounter = new Questionfour();
        int[] pings = {1, 100, 3001, 3002};
        int[] results = new int[4];
        for (int i = 0; i < 4; i++) {
            results[i] = recentCounter.ping(pings[i]);
        }
        System.out.println(Arrays.toString(results));
    }
}