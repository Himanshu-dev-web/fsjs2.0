import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Questionsix {
    public static void main(String[] args) {
       
        String s = "abcde";
        String k = "cdeab";
        boolean ans  = rotateString(s,k);
        System.out.println(ans);
    }

    public static boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        int res = (goal+goal).indexOf(s);

        if(res==-1 || s.length()!=goal.length()){
            return false;
        }
        return true;   
    }
}
