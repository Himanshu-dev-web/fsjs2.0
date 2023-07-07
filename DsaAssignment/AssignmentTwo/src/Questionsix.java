import java.util.HashSet;

public class Questionsix {
    public static void main(String[] args) {
        HashSet<Integer> hsh = new HashSet<>();

        int[] arr = {1,2,3,3,5,6};

        for (int i = 0; i < arr.length; i++) {
            hsh.add(arr[i]);
        }

        System.out.println(hsh.size());
        System.out.println(arr.length);
    }

}
