import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Questionseven {

    public static int deleteSimilarWords(List<String> words) {
        Stack<String> stack = new Stack<>();
        for (String word : words) {
            if (stack.isEmpty() || !word.equals(stack.peek())) {
                stack.push(word);
            } else {
                stack.pop();
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("ab");
        words.add("aa");
        words.add("aa");
        words.add("bcd");
        words.add("ab");
        int number_of_words_left = deleteSimilarWords(words);
        System.out.println(number_of_words_left);
    }
}