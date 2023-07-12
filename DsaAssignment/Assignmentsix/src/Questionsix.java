import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Questionsix {
    public static void main(String[] args) {
       
        int[] arr= {1,3,4,2,6,8};
        int[] ans = findOriginalArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findOriginalArray(int[] changed) {
    int[] temp = new int[changed.length/2];
    Queue<Integer> x = new LinkedList<>();
    Arrays.sort(changed);
    int i = 0;
    for(int num : changed){
        if(!x.isEmpty() && x.peek()==num)
            temp[i++] = x.poll()/2;
        else x.add(num*2);
    }
    return x.size()>0 ? new int[]{}:temp;
}

}
