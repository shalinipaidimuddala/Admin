import java.util.*;

public class CheckDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4);
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        boolean hasDuplicates = uniqueNumbers.size() != numbers.size();
        System.out.println("Contains duplicates? " + hasDuplicates); // Output: true
    }
}
