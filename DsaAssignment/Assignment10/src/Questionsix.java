import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Questionsix {
    public static void main(String[] args) {
        int n = 3;
        move(n, 1, 2, 3);
    }

    public static void move(int disks, int source, int auxiliary, int target)
    {
        if (disks > 0)
        {
              move(disks - 1, source, target, auxiliary);
 
            System.out.println("Move disk " + disks + " from " + source + " —> " +
                                target);
 
           move(disks - 1, auxiliary, source, target);
        }
    }
}
