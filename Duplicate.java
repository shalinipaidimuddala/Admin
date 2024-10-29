import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = new ArrayList<>(new LinkedHashSet<>(numbers));
        System.out.println(uniqueNumbers); // Output: [1, 2, 3, 4, 5]
    }
}
