import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class questioneight {
    public static void main(String[] args) {
        
        int[] changed = {1,3,4,2,6,8};
      
        Arrays.sort(changed);
        Queue<Integer> queue = new LinkedList<>();
        int[] res = new int[changed.length/2];
        int i = 0;
        for(int ele : changed){
            if(!queue.isEmpty() && queue.peek() == ele){
                res[i++] = queue.poll()/2;
            }else{
                queue.add(ele*2);
            }
        }
        System.out.println((queue.size() == 0)? Arrays.toString(res): "0");
    }
}
