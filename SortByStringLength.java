import java.util.*;

public class SortByStringLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi");
        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words); // Output: [kiwi, apple, banana]
    }
}
