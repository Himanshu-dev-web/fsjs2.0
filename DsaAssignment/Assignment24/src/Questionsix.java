import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Questionsix {
    
 public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> freq=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            freq.put(words[i],freq.getOrDefault(words[i],0)+1);
        }
        List<String> res = new ArrayList(freq.keySet());
         Collections.sort(res, (w1, w2) -> freq.get(w1).equals(freq.get(w2)) ?
                w1.compareTo(w2) : freq.get(w2) - freq.get(w1));

        return res.subList(0, k);
    }

     public static void main(String[] args) {
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        List<String> mostFrequentStrings = topKFrequent(words, k);
        for (String word : mostFrequentStrings) {
            System.out.print(word + " ");
        }
    }
}

