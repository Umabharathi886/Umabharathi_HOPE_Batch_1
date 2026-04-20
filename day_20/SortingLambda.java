import java.util.*;
public class SortingLambda{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Banana");
        words.add("Watermlon");
        words.add("Appl");
        words.add("Grapes");
        Collections.sort(words,(a,b)->b.compareTo(a));// its rverse sorted
        words.sort(String::compareTo);// It is sorting in alphabetic order
        System.out.println(words);
    }
}